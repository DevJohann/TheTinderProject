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
	
	JLabel nameLabelLogin = new JLabel("Usuario:");
	JLabel passwordLabelLogin = new JLabel("Contraseña:");
	JLabel mainLabelLogin = new JLabel("LOGIN");
	JTextField nameFieldLogin = new JTextField();
	JTextField passwordFieldLogin = new JTextField();
	JButton sendDataButtonLogin = new JButton("Enviar");
	JButton backButtonLogin = new JButton("Volver");
	JFrame mainFrameLogin;
	
	
	public LoginView() {
		
		//JFrame inicio
		mainFrameLogin = new JFrame();
		mainFrameLogin.setBounds(450, 100, 500, 500);
		mainFrameLogin.setLayout(null);
		mainFrameLogin.setVisible(true);
		mainFrameLogin.setTitle("Tinder");
		
		//MainLabel section
		mainLabelLogin.setBounds(135, 20, 400, 60);
		mainLabelLogin.setFont(new Font("Serif", Font.BOLD, 60));
		mainFrameLogin.add(mainLabelLogin);
			//MainView.mainFrame.add(mainLabelLogin);
		
		//NameLabel section
		nameLabelLogin.setBounds(60, 150, 180, 35);
		nameLabelLogin.setFont(new Font("Serif", Font.BOLD, 20));
		mainFrameLogin.add(nameLabelLogin);
			//MainView.mainFrame.add(nameLabelLogin);
		
		//NameField section
		nameFieldLogin.setBounds(170, 155, 170, 30);
		mainFrameLogin.add(nameFieldLogin);
			//MainView.mainFrame.add(nameFieldLogin);
		
		//PasswordLabel section
		passwordLabelLogin.setBounds(60, 190, 180, 35);
		passwordLabelLogin.setFont(new Font("Serif", Font.BOLD, 20));
		mainFrameLogin.add(passwordLabelLogin);
			//MainView.mainFrame.add(passwordLabelLogin);
		
		//PasswordField section
		passwordFieldLogin.setBounds(170, 195, 170, 30);
		mainFrameLogin.add(passwordFieldLogin);
			//MainView.mainFrame.add(passwordFieldLogin);
		
		//SendDataButton section
		sendDataButtonLogin.setBounds(190, 240, 120, 30);
		mainFrameLogin.add(sendDataButtonLogin);
			//MainView.mainFrame.add(sendDataButtonLogin);
		
		//backButton section
		backButtonLogin.setBounds(15, 420, 100, 30);
		mainFrameLogin.add(backButtonLogin);
			//MainView.mainFrame.add(backButtonLogin);
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
