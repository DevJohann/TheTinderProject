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
	private String rangeAge = "";
	private boolean firstTimer = true;
	private int likesAmount = 0;
	//private ArrayList<String> gustos = new ArrayList<String>();
	private ArrayList<String> preferences = new ArrayList<String>();
	//private ArrayList<UserModel> matchedUsers = new ArrayList<UserModel>();
	private ArrayList<UserModel> preMatchedUsers = new ArrayList<UserModel>();
	
	
	public UserModel(String username, String password) {
		this.username = username;
		this.password = password;
		
	}
	/* No pudimos profe :(
	 
	public void addMatchedUser(UserModel userModel) {
		matchedUsers.add(userModel);
		
	}
	public ArrayList<UserModel> getMatchedUser(){
		return matchedUsers;
	}
	public ArrayList<UserModel> getPreMatchedUser(){
		return preMatchedUsers;
	}
	public void getOneLike(UserModel whoLiked) { //recibir like (de WorkingUser)
		this.likesAmount++;
		for(UserModel userModel : preMatchedUsers) { //Verificar si la persona que dió like ya está en preMatches
			if(userModel.getUsernameUM().equals(whoLiked.getUsernameUM())) { // Si es así, entonces hizo match
				preMatchedUsers.remove(whoLiked); //Eliminar de prematches
				matchedUsers.add(whoLiked); //Agregar a matches
				break;
			}
			else {
				this.preMatchedUsers.add(whoLiked); //Si no estaba en preMatched, entonces ahora si
				break;
			}
		}
		
	}
	*/
	public int getLikes() {
		return this.likesAmount;
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
	public String getPreferredCity() {
		return preferences.get(0);
	}
	public String getPreferredGender() {
		return preferences.get(1);
	}
	public String getPreferredAge() {
		return preferences.get(2);
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
		if(age <= 25 && age >= 18) {
			rangeAge = "A";
		}
		else if(age <= 30 && age > 25){
			rangeAge = "B";
		}
		else if(age <= 45 && age > 30){
			rangeAge = "C";
		}
		else if(age <= 60 && age > 45){
			rangeAge = "D";
		}
	}
	public String getAgeRange() {
		return rangeAge;
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
	public void setPreferredCity(String city) {
		preferences.add(city);
	}
	public void setPreferredGender(String gender) {
		preferences.add(gender);
	}
	public void setPreferredAge(String age) {
		preferences.add(age);
	}
	
	
}
