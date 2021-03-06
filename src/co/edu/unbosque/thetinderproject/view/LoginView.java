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
	
	JLabel usernameLabelLogin = new JLabel("Usuario:");
	JLabel passwordLabelLogin = new JLabel("Contraseņa:");
	JLabel mainLabelLogin = new JLabel("LOGIN");
	JLabel footerLabelLogin = new JLabel();
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
		usernameLabelLogin.setBounds(60, 150, 180, 35);
		usernameLabelLogin.setFont(new Font("Serif", Font.BOLD, 20));
		mainFrameLogin.add(usernameLabelLogin);
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
		
		//footerLabel section
		footerLabelLogin.setBounds(165, 350, 400, 40);
		footerLabelLogin.setFont(new Font("Serif", Font.BOLD, 15));
		mainFrameLogin.add(footerLabelLogin);
		
		//backButton section
		backButtonLogin.setBounds(15, 420, 100, 30);
		mainFrameLogin.add(backButtonLogin);
			//MainView.mainFrame.add(backButtonLogin);
	}
	
	public String getUsernameTFieldLogin() {
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
	public JFrame getMainFrameLogin() {
		return this.mainFrameLogin;
	}
	public JLabel getFooterLabelLogin() {
		return this.footerLabelLogin;
	}


}
