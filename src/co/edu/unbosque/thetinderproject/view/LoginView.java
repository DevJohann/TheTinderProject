package co.edu.unbosque.thetinderproject.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//Programador: Mauricio
public class LoginView {
	
	JLabel nameLabelLogin = new JLabel("Nombre de usuario");
	JLabel passwordLabelLogin = new JLabel("Contraseña");
	JTextField nameFieldLogin = new JTextField();
	JTextField passwordFieldLogin = new JTextField();
	JButton sendDataButtonLogin = new JButton("Enviar");
	JButton backButtonLogin = new JButton("Volver");
	
	public void showLoginView() {
		
		
		
	}
	public String getNameTFieldLogin() {
		return nameFieldLogin.getText();
	}
	public String getPasswordTFieldLogin() {
		return passwordFieldLogin.getText();	
	}
	public JButton getSendDataButtonLogin() {
		return sendDataButtonLogin;
	}
	public JButton getBackButton() {
		return backButtonLogin;
	}

}
