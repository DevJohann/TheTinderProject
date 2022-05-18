package co.edu.unbosque.thetinderproject.model;

public class RegisterModel {
	public void addUserRM(String username, String password) {
		UserDataBaseModel.addUser(username, password);
	}
}
