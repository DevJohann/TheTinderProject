package co.edu.unbosque.thetinderproject.model;

import java.util.ArrayList;
import java.util.Random;
import co.edu.unbosque.thetinderproject.model.*;

public class UserDataBaseModel {

	//Programmer: Johann 
	//(Application local database)
	private static ArrayList<UserModel> UserDB = new ArrayList<UserModel>();
	private static UserModel WorkingUser;
	public static Random rand = new Random();
	
	//Dummies section
	public static void addDummies() {
		UserDB.add(new UserModel("admin", "1234"));
		UserDB.get(0).setName("Admin");
		UserDB.get(0).setAge(19);
		UserDB.get(0).setDescription("Descripción de prueba");
		UserDB.get(0).setPicture("foto1.jpg");
		UserDB.add(new UserModel("root", "toor"));
		UserDB.get(1).setName("ROOT");
		UserDB.get(1).setAge(19);
		UserDB.get(1).setDescription("Descripción de prueba");
		UserDB.get(1).setPicture("foto2.jpg");
		UserDB.add(new UserModel("Mauricio", "1234"));
		UserDB.get(2).setName("Edison Mauricio Beltran Garzón");
		UserDB.get(2).setAge(19);
		UserDB.get(2).setDescription("Descripción de prueba");
		UserDB.get(2).setPicture("foto3.jpg");
		UserDB.add(new UserModel("Jennifer", "1234"));
		UserDB.get(3).setName("Jennifer Penagos");
		UserDB.get(3).setAge(19);
		UserDB.get(3).setDescription("Descripción de prueba");
		UserDB.get(3).setPicture("foto1.jpg");
		UserDB.add(new UserModel("Johann", "1234"));
		UserDB.get(4).setName("Johann Felipe");
		UserDB.get(4).setAge(19);
		UserDB.get(4).setDescription("Descripción de prueba");
		UserDB.get(4).setPicture("foto1.jpg");
	}
	
	//End of dummies section
	
	public static UserModel searchUser(String username) {
		for(UserModel user : UserDB) {
			if(user.getUsernameUM().equals(username)) {
				return user;
			}
		}
		return null;
	}
	public static boolean checkRepeated(String username) {
		for(UserModel user : UserDB) {
			if(user.getUsernameUM().equals(username)) {
				return true;
				
			}
		}
		return false;
	}
	public static boolean checkFirstTimer(String username) {
		if(WorkingUser.getFirstTimerUM()) {
			return true;
		}
		return false;
	}
	public static void setFirstTimer(boolean value) {
		WorkingUser.setFirstTimer(value);
	}
	
	public static void addUser(String username, String password) {
		UserDB.add(new UserModel(username, password)); //Check repeated user
	}
	public static boolean validateCredentials(String username, String password) {
		for(UserModel user : UserDB) {
			if(user.getUsernameUM().equals(username) && user.getPasswordUM().equals(password)) {
				WorkingUser = user;
				return true;
			}
		}
		return false;
	}
	public static void setUserNewData(String Nombre, String Nacionalidad , int Edad, String Genero , String Ciudad, String Descripcion, String pictureSrc) {
		//NewUserData
		WorkingUser.setName(Nombre);
		WorkingUser.setNacionality(Nacionalidad);
		WorkingUser.setAge(Edad);
		WorkingUser.setGender(Genero);
		WorkingUser.setCityOfResidence(Ciudad);
		WorkingUser.setDescription(Descripcion);
		WorkingUser.setPicture(pictureSrc);
		
	}
	public static boolean checkFilledData() {
		if(WorkingUser.getDescriptionUM().length() == 0) {
			return false;
		}
		return true;
	}
	
	public static ArrayList<String> returnRandomUser() {
		ArrayList<String> returnableData = new ArrayList<String>();
		int numRandom = rand.nextInt(UserDB.size());
		//return UserDB.get(numRandom);
		UserModel returnableUser = UserDB.get(numRandom);
		while(returnableUser.getUsernameUM().equals(WorkingUser.getUsernameUM())) {
			numRandom = rand.nextInt(UserDB.size());
			returnableUser = UserDB.get(numRandom);
			if(returnableUser.getUsernameUM() != WorkingUser.getUsernameUM()) {
				returnableData.add(returnableUser.getNameUM());
				returnableData.add(returnableUser.getAgeUM()+"");
				returnableData.add(returnableUser.getDescriptionUM());
				returnableData.add(returnableUser.getPictureUM());
				return returnableData;
			}
			else {
				continue;
			}
		}
		returnableData.add(returnableUser.getNameUM());
		returnableData.add(returnableUser.getAgeUM()+"");
		returnableData.add(returnableUser.getDescriptionUM());
		returnableData.add(returnableUser.getPictureUM());
		return returnableData;
	}

	public void addLike() {
		
	}
	
	
	
	//JFrame.setLocationRelativeTo(null)
}
