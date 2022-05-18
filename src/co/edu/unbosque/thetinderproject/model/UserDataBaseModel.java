package co.edu.unbosque.thetinderproject.model;

import java.util.ArrayList;
import co.edu.unbosque.thetinderproject.model.*;

public class UserDataBaseModel {

	//Programmer: Johann
	ArrayList<UserModel> UserDB = new ArrayList<UserModel>();
	
	public UserModel searchUser(String username) {
		for(UserModel user : UserDB) {
			if(user.getUsernameUM().equals()) {
				return user;
			}
		}
		return null;
	}
	
	public void addUser(String username, String password) {
		UserDB.add(new UserModel(username, password));
	}
	
	//JFrame.setLocationRelativeTo(null)
}
