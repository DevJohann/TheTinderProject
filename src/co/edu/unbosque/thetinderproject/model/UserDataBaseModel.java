package co.edu.unbosque.thetinderproject.model;

import java.util.ArrayList;
import co.edu.unbosque.thetinderproject.model.*;

public class UserDataBaseModel {

	//Programmer: Johann
	private static ArrayList<UserModel> UserDB = new ArrayList<UserModel>();
	private static UserModel WorkingUser;
	
	public static UserModel searchUser(String username) {
		for(UserModel user : UserDB) {
			if(user.getUsernameUM().equals(username)) {
				return user;
			}
		}
		return null;
	}
	
	public static void addUser(String username, String password) {
		UserDB.add(new UserModel(username, password));
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
	public static void setUserNewData(/*Data*/) {
		
	}
	
	//JFrame.setLocationRelativeTo(null)
}
