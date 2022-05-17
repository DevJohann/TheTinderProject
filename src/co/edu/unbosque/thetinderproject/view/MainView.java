package co.edu.unbosque.thetinderproject.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainView {
	
	JButton loginButton;
	JButton registerButton;
	JLabel mainMessajeLabel;
	JFrame mainFrame;
	
	public MainView() {
		mainFrame.setBounds(450, 100, 500, 500);
		mainFrame.setLayout(null);
		mainFrame.setVisible(true);
		
		//LoginButton section
		loginButton.setBounds(120, 120, 120, 40);
		mainFrame.add(loginButton);
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
