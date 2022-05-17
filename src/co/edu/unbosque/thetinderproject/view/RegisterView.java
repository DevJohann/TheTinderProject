package co.edu.unbosque.thetinderproject.view;

import javax.swing.*;

//Programador: Johann
public class RegisterView {
	JLabel nameLabelRegister = new JLabel("Usuario:");
	JLabel passwordLabelRegister = new JLabel("Contraseña:");
	JTextField nameFieldRegister = new JTextField();
	JTextField passwordFieldRegister = new JTextField();
	JButton sendDataButtonRegister = new JButton("Enviar");
	
	public void showRegisterView() {
		
	}
	
	public String getPasswordRegister() {
		return this.passwordFieldRegister.getText();
	}
	public String getNameRegister() {
		return this.nameFieldRegister.getText();
	}
	public JButton getSendDataButtonRegister() {
		return this.sendDataButtonRegister;
	}
}
