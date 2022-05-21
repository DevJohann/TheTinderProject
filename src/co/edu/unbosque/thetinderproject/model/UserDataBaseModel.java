package co.edu.unbosque.thetinderproject.model;

import java.util.ArrayList;
import co.edu.unbosque.thetinderproject.model.*;

public class UserDataBaseModel {

	//Programmer: Johann 
	//(Application local database)
	private static ArrayList<UserModel> UserDB = new ArrayList<UserModel>();
	private static UserModel WorkingUser;
	
	//Dummies section
	public static void addDummies() {
		UserDB.add(new UserModel("admin", "1234"));
		UserDB.add(new UserModel("root", "toor"));
		UserDB.add(new UserModel("Mauricio", "1234"));
		UserDB.add(new UserModel("Jennifer", "1234"));
		UserDB.add(new UserModel("Johann", "1234"));
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
	public static void setUserNewData(String Nombre, String Nacionalidad , int Edad, String Genero , String Ciudad, String Descripcion) {
		//NewUserData
		WorkingUser.setName(Nombre);
		WorkingUser.setNacionality(Nacionalidad);
		WorkingUser.setAge(Edad);
		WorkingUser.setGender(Genero);
		WorkingUser.setCityOfResidence(Ciudad);
		WorkingUser.setDescription(Descripcion);
	}
	
	//JFrame.setLocationRelativeTo(null)
}
