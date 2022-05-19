package co.edu.unbosque.thetinderproject.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainView {
	
	JButton loginButton = new JButton("Login");
	JButton registerButton = new JButton("Register");
	JLabel mainMessageLabel = new JLabel("TINDER");
	JLabel footer = new JLabel("By: Crypted Security ©");
	static JFrame mainFrame = new JFrame();
	
	public MainView() {
		mainFrame.setBounds(450, 100, 500, 500);
		mainFrame.setLayout(null);
		mainFrame.setVisible(true);
		mainFrame.setTitle("Tinder");
		
		//LoginButton section
		loginButton.setBounds(180, 130, 120, 40);
		mainFrame.add(loginButton);
		
		//RegisterButton section
		registerButton.setBounds(180, 190, 120, 40);
		mainFrame.add(registerButton);
		
		//MainMessajeLabel section
		mainMessageLabel.setBounds(125, 20, 400, 60);
		mainMessageLabel.setFont(new Font("Serif", Font.BOLD, 60));
		mainFrame.add(mainMessageLabel);
		
		//Footer section
		footer.setBounds(182, 400, 150, 40);
		footer.setFont(new Font("Serif", Font.ITALIC, 12));
		//footer.setHorizontalAlignment(50);
		mainFrame.add(footer);
	}
	public JButton getLoginButton() {
		return this.loginButton;
	}
	public JButton getRegisterButton() {
		return this.registerButton;
	}
	public JFrame getMainFrame() {
		return this.mainFrame;
	}
	
	
	 
	
	
	
	
}
