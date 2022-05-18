package co.edu.unbosque.thetinderproject.model;

public class LoginModel {
	public boolean ValidateUser(String username, String password) {
		if(UserDataBaseModel.validateCredentials(username, password)) {
			return true;
		}
		return false;
	}
}
