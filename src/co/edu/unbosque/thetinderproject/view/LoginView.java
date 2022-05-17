package co.edu.unbosque.thetinderproject.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginView {
	
	JLabel nameLabelLogin;
	JLabel passwordLabelLogin;
	JTextField nameFieldLogin;
	JTextField passwordFieldLogin;
	JButton sendDataButtonLogin;
	
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

}
