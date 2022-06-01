package co.edu.unbosque.thetinderproject.model;

public class ProfileModel {
	
	public ProfileModel() {
		
	}
	
	public UserModel getRandomUser() {
		
		return UserDataBaseModel.returnRandomUser();
	}
	

}
