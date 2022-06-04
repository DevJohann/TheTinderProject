package co.edu.unbosque.thetinderproject.model;
import java.util.*;

public class UserModel {
	
	//Programmer: Mauricio
	
	private String name;
	private String username;
	private String password;
	private String picture; //Ruta a la foto
	private String nacionality;
	private String cityOfResidence;
	private int age;
	private String gender;
	private String description;
	private boolean firstTimer = true;
	private ArrayList<String> gustos = new ArrayList<String>();
	private ArrayList<String> preferences = new ArrayList<String>();
	private ArrayList<UserModel> matchedUsers = new ArrayList<UserModel>();
	
	
	
	public UserModel(String username, String password) {
		this.username = username;
		this.password = password;
		
	}
	public void addMatchedUser(UserModel userModel) {
		matchedUsers.add(userModel);
		
	}
	public String getNameUM() {
		return name;
	}
	public String getUsernameUM() {
		return username;
	}
	public String getPasswordUM() {
		return password;
	}
	public String getPictureUM() {
		return picture;
	}
	public String getNacionalityUM() {
		return nacionality;
	}
	public String getCityOfResidenceUM() {
		return cityOfResidence;
	}
	public int getAgeUM() {
		return age;
	}
	public String getGenderUM() {
		return gender;
	}
	public String getDescriptionUM() {
		return description;
	}
	public boolean getFirstTimerUM() {
		return firstTimer;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public void setNacionality(String nacionality) {
		this.nacionality = nacionality;
	}
	public void setCityOfResidence(String cityOfResidence) {
		this.cityOfResidence = cityOfResidence;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setFirstTimer(boolean firstTimer) {
		this.firstTimer = firstTimer;
	}
	
	
}
