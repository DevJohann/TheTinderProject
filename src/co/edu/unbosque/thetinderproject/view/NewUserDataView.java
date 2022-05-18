package co.edu.unbosque.thetinderproject.view;

import javax.swing.*;

//Programador: Johann
public class NewUserDataView {
	
	JLabel nameLabelNewUD = new JLabel("Nombre:");
	JLabel genderLabelNewUD = new JLabel("Genero:");
	JLabel ageLabelNewUD = new JLabel("Edad:");
	JLabel nationalityLabelNewUD = new JLabel("Nacionalidad:");
	JTextField nameFieldNewUD = new JTextField();
	JTextField genderFieldNewUD = new JTextField();
	JTextField ageFieldNewUD = new JTextField();
	JTextField nationalityFieldNewUD = new JTextField();
	JTextArea descriptionTextAreaNewUD = new JTextArea();
	JButton backButtonNewUD = new JButton("Volver");
	
	public void showNewUserDataView() {
		
	}
	public String getNameFieldNewUD() {
		return this.nameFieldNewUD.getText();
	}
	public String getGenderFieldNewUD() {
		return this.genderFieldNewUD.getText();
	}
	public String getAgeFieldNewUD() {
		return this.ageFieldNewUD.getText();
	}
	public String getDescriptionFieldNewUD() {
		return this.descriptionTextAreaNewUD.getText();
	}
	public JButton getBackButtonNewUD() {
		return this.backButtonNewUD;
	}
}
