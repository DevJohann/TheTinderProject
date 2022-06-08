package co.edu.unbosque.thetinderproject.model;

public class MatchModel { //SOLUCIÓN 2 (CLASE STATIC)
	
	static UserModel idNo1; //Index 1 (WorkingUser)
	static UserModel idNo2; //Index 2 (Showing User)
	
	public static void setIdWorkingUser(UserModel userModel) {
		idNo1 = userModel;
		
	}
	public static void setIdShowingUser(UserModel userModel) {
		idNo2 = userModel;
	}
	
}
