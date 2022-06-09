package co.edu.unbosque.thetinderproject.model;

import java.util.ArrayList;
import java.util.Random;


import co.edu.unbosque.thetinderproject.model.*;

public class UserDataBaseModel {

	// Programmer: Johann
	// (Application local database)
	private static ArrayList<UserModel> UserDB = new ArrayList<UserModel>();
	private static UserModel WorkingUser;
	private static UserModel ShowingUser;
	public static Random rand = new Random();

	// Dummies section
	public static void addDummies() {
		UserDB.add(new UserModel("admin", "1234"));
		UserDB.get(0).setName("Admin");
		UserDB.get(0).setAge(26);
		UserDB.get(0).setGender("Hombre");
		UserDB.get(0).setDescription("Descripci�n de prueba");
		UserDB.get(0).setPicture("foto1.jpg");
		UserDB.get(0).setCityOfResidence("Gama");
		UserDB.get(0).setPreferredCity("Bogota");
		UserDB.get(0).setPreferredGender("Hombre");
		UserDB.get(0).setPreferredAge("A");
		UserDB.add(new UserModel("root", "toor"));
		UserDB.get(1).setName("ROOT");
		UserDB.get(1).setAge(19);
		UserDB.get(1).setGender("Mujer");
		UserDB.get(1).setDescription("Descripci�n de prueba");
		UserDB.get(1).setPicture("foto2.jpg");
		UserDB.get(1).setCityOfResidence("Bogota");
		UserDB.get(1).setPreferredCity("Gama");
		UserDB.get(1).setPreferredGender("Mujer");
		UserDB.get(1).setPreferredAge("B");
		UserDB.add(new UserModel("Mauricio", "1234"));
		UserDB.get(2).setName("Edison Mauricio Beltran Garzón");
		UserDB.get(2).setAge(40);
		UserDB.get(2).setGender("Hombre");
		UserDB.get(2).setDescription("Descripci�n de prueba");
		UserDB.get(2).setPicture("foto3.jpg");
		UserDB.get(2).setCityOfResidence("Cali");
		UserDB.get(2).setPreferredCity("Cali");
		UserDB.get(2).setPreferredGender("Mujer");
		UserDB.get(2).setPreferredAge("D");
		UserDB.add(new UserModel("Jennifer", "1234"));
		UserDB.get(3).setName("Jennifer Penagos");
		UserDB.get(3).setAge(21);
		UserDB.get(3).setGender("Mujer");
		UserDB.get(3).setDescription("Descripci�n de prueba");
		UserDB.get(3).setCityOfResidence("Medellin");
		UserDB.get(3).setPicture("foto1.jpg");
		UserDB.get(3).setPreferredCity("Bogota");
		UserDB.get(3).setPreferredGender("Hombre");
		UserDB.get(3).setPreferredAge("A");
		UserDB.add(new UserModel("Johann", "1234"));
		UserDB.get(4).setName("Johann Felipe");
		UserDB.get(4).setAge(30);
		UserDB.get(4).setGender("Hombre");
		UserDB.get(4).setDescription("Descripci�n de prueba");
		UserDB.get(4).setPicture("foto1.jpg");
		UserDB.get(4).setCityOfResidence("Bogota");
		UserDB.get(4).setPreferredCity("Medellin");
		UserDB.get(4).setPreferredGender("Mujer");
		UserDB.get(4).setPreferredAge("D");
		UserDB.add(new UserModel("Edison", "1234"));
		UserDB.get(5).setName("Edison Garzon");
		UserDB.get(5).setAge(45);
		UserDB.get(5).setGender("Hombre");
		UserDB.get(5).setDescription("Descripci�n de prueba");
		UserDB.get(5).setPicture("foto3.jpg");
		UserDB.get(5).setCityOfResidence("Bogota");
		UserDB.get(5).setPreferredCity("Medellin");
		UserDB.get(5).setPreferredGender("Mujer");
		UserDB.get(5).setPreferredAge("D");
		UserDB.add(new UserModel("Alberto", "1234"));
		UserDB.get(6).setName("Alberto Salas");
		UserDB.get(6).setAge(18);
		UserDB.get(6).setGender("Hombre");
		UserDB.get(6).setDescription("Descripci�n de prueba");
		UserDB.get(6).setPicture("foto3.jpg");
		UserDB.get(6).setCityOfResidence("Bogota");
		UserDB.get(6).setPreferredCity("Medellin");
		UserDB.get(6).setPreferredGender("Mujer");
		UserDB.get(6).setPreferredAge("D");
		UserDB.add(new UserModel("Eva", "1234"));
		UserDB.get(7).setName("Eva Maria");
		UserDB.get(7).setAge(52);
		UserDB.get(7).setGender("Mujer");
		UserDB.get(7).setDescription("Descripci�n de prueba");
		UserDB.get(7).setPicture("foto2.jpg");
		UserDB.get(7).setCityOfResidence("Bogota");
		UserDB.get(7).setPreferredCity("Medellin");
		UserDB.get(7).setPreferredGender("Mujer");
		UserDB.get(7).setPreferredAge("D");
		
	}

	// End of dummies section
	
	public static boolean checkShowns() {
		int contador = 0;
		for(UserModel checkShowns: UserDB) {
			if(checkShowns.getShownUM() == true) {
				contador++;
			}
		}
		if(contador < UserDB.size()) {
			return false;
		}
		return true;
	}

	public static UserModel searchUser(String username) {
		for (UserModel user : UserDB) {
			if (user.getUsernameUM().equals(username)) {
				return user;
			}
		}
		return null;
	}

	public static boolean checkRepeated(String username) {
		for (UserModel user : UserDB) {
			if (user.getUsernameUM().equals(username)) {
				return true;

			}
		}
		return false;
	}

	public static boolean checkFirstTimer(String username) {
		if (WorkingUser.getFirstTimerUM()) {
			return true;
		}
		return false;
	}

	public static void setFirstTimer(boolean value) {
		WorkingUser.setFirstTimer(value);
	}

	public static void addUser(String username, String password) {
		UserDB.add(new UserModel(username, password)); // Check repeated user
	}

	public static boolean validateCredentials(String username, String password) {
		for (UserModel user : UserDB) {
			if (user.getUsernameUM().equals(username) && user.getPasswordUM().equals(password)) {
				WorkingUser = user;
				MatchModel.setIdWorkingUser(WorkingUser);
				return true;
			}
		}
		return false;
	}

	public static void setUserNewData(String Nombre, String Nacionalidad, int Edad, String Genero, String Ciudad,
			String Descripcion, String pictureSrc) {
		// NewUserData
		WorkingUser.setName(Nombre);
		WorkingUser.setNacionality(Nacionalidad);
		WorkingUser.setAge(Edad);
		WorkingUser.setGender(Genero);
		WorkingUser.setCityOfResidence(Ciudad);
		WorkingUser.setDescription(Descripcion);
		WorkingUser.setPicture(pictureSrc);

	}

	public static boolean checkFilledData() {
		if (WorkingUser.getDescriptionUM().length() == 0) {
			return false;
		}
		return true;
	}

	static int numRandom;

	public static ArrayList<String> returnRandomUser() {
		ArrayList<String> returnableData = new ArrayList<String>();
		numRandom = rand.nextInt(UserDB.size());
		// return UserDB.get(numRandom);
		UserModel returnableUser = UserDB.get(numRandom);
		while (returnableUser.getUsernameUM().equals(WorkingUser.getUsernameUM())) {
			numRandom = rand.nextInt(UserDB.size());
			returnableUser = UserDB.get(numRandom);
			if ((returnableUser.getUsernameUM() != WorkingUser.getUsernameUM()) && (WorkingUser.getPreferredCity().equals(returnableUser.getCityOfResidenceUM()) || WorkingUser.getPreferredGender().equals(returnableUser.getGenderUM()) || WorkingUser.getPreferredAge().equals(returnableUser.getAgeRange())) && returnableUser.getShownUM() == false) { //
				System.out.println(WorkingUser.getPreferredGender() + " / " + returnableUser.getGenderUM());
				System.out.println(WorkingUser.getPreferredAge() + " / " + returnableUser.getAgeRange());
				System.out.println(WorkingUser.getPreferredCity() + " / " + returnableUser.getCityOfResidenceUM());
				returnableData.add(returnableUser.getNameUM());
				returnableData.add(returnableUser.getAgeUM() + "");
				returnableData.add(returnableUser.getDescriptionUM());
				returnableData.add(returnableUser.getPictureUM());
				ShowingUser = returnableUser;
				MatchModel.setIdShowingUser(returnableUser);
				return returnableData;
			} else {
				continue;
			}
			
		}
		return null;
	
		/*
		System.out.println(WorkingUser.getPreferredGender() + " / " + returnableUser.getGenderUM());
		returnableData.add(returnableUser.getNameUM());
		returnableData.add(returnableUser.getAgeUM() + "");
		returnableData.add(returnableUser.getDescriptionUM());
		returnableData.add(returnableUser.getPictureUM());
		MatchModel.setIdShowingUser(returnableUser);
		return returnableData;
		*/
	}
	public static void setShown(boolean value) {
		ShowingUser.setShownUM(true);
	}
	public static void resetShown() {
		for(UserModel user : UserDB) {
			user.setShownUM(false);
		}
	}
	public static ArrayList<UserModel> retrieveWUMatchesDB(){ //WU = WorkingUser
		return WorkingUser.retrieveMatchesDB();
	}
	public static void addPreferences(String city, String gender, String age) {
		WorkingUser.resetPreferences(); //Para que no se acumulen
		WorkingUser.setPreferredCity(city);
		WorkingUser.setPreferredGender(gender);
		WorkingUser.setPreferredAge(age);
	}

	public static void addLike() { // El usuario actual envía un like
		// Index de la persona que se está evaluando: numRandom
		//UserModel showingUser = UserDB.get(numRandom);
		//showingUser.getOneLike(WorkingUser); // La persona evaluada recibe un like, y tambien mira si hizo match o no
		// System.out.println(showingUser.getLikes());
		WorkingUser.liked(ShowingUser);
		if(ShowingUser.checkMatch(WorkingUser)) {//Ahora será matchedUsers de ShowingUser el que será recorrido para verificar que WorkingUser esté ahí
			System.out.println("MATCH!"); //FUNCIONA :D
		}
	}
/*
	public static ArrayList<String> retrieveMatchedDB() {
		//ArrayList<UserModel> retrievedDB = WorkingUser.getMatchedUser();
		ArrayList<String> retornableData = new ArrayList<String>();
		// System.out.println(WorkingUser.getMatchedUser().size()); //Debug //Error
		// System.out.println(WorkingUser.getPreMatchedUser().size()); //Debug
		try {
			//retornableData.add(retrievedDB.get(0).getNameUM()); // Error IndexOutOfBounds
			//retornableData.add(retrievedDB.get(0).getAgeUM() + "");
			return retornableData;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error :)");
		}
		return null;
	}
*/
	public static void checkMatches() {
		// Con quien ha hecho match WorkingUser

	}

	// JFrame.setLocationRelativeTo(null)

	// SOLUCIÓN CON MATRICES
	//		 UserA UserB UserC AÑADIDO
	/*UserA  [[0], [0],  [0], 	[0]]  
	 *UserB  [[0], [0],  [1], 	[0]] 
	 *UserC  [[0], [1],  [0], 	[0]] 
 	 *Añadido[[0], [1],  [0], 	[0]]
	 */
	
}
