package co.edu.unbosque.thetinderproject.view;

import java.awt.Font;

import javax.swing.*;

//Programador: Johann
public class RegisterView {
	JLabel nameLabelRegister = new JLabel("Usuario:");
	JLabel passwordLabelRegister = new JLabel("Contraseña:");
	JLabel mainLabelRegister = new JLabel("REGISTRO");
	JTextField nameFieldRegister = new JTextField();
	JTextField passwordFieldRegister = new JTextField();
	JButton sendDataButtonRegister = new JButton("Enviar");
	JButton backButtonRegister = new JButton("Volver");
	JFrame mainFrameRegister;
	
	public RegisterView() {
	
		//JFrame inicio
		
		mainFrameRegister = new JFrame();
		mainFrameRegister.setBounds(450, 100, 500, 500);
		mainFrameRegister.setLayout(null);
		mainFrameRegister.setVisible(true);
		mainFrameRegister.setTitle("Tinder");
		
		//MainLabel section
		mainLabelRegister.setBounds(110, 20, 400, 80);
		mainLabelRegister.setFont(new Font("Serif", Font.BOLD, 50));
		mainFrameRegister.add(mainLabelRegister);

		//nameLabel section
		nameLabelRegister.setBounds(60, 150, 180, 35);
		nameLabelRegister.setFont(new Font("Serif", Font.BOLD, 20));
		mainFrameRegister.add(nameLabelRegister);
		
		//nameFielRegister section
		nameFieldRegister.setBounds(170, 155, 170, 30);
		mainFrameRegister.add(nameFieldRegister);
		
		//passwordLabel section
		passwordLabelRegister.setBounds(60, 190, 180, 35);
		passwordLabelRegister.setFont(new Font("Serif", Font.BOLD, 20));
		mainFrameRegister.add(passwordLabelRegister);
		
		//passwordFielRegister section
		passwordFieldRegister.setBounds(170, 195, 170, 30);
		mainFrameRegister.add(passwordFieldRegister);
		
		//SendDataButton section
		sendDataButtonRegister.setBounds(190, 240, 120, 30);
		mainFrameRegister.add(sendDataButtonRegister);
				
		//backButton section
		backButtonRegister.setBounds(15, 420, 100, 30);
		mainFrameRegister.add(backButtonRegister);
		
	}
	
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
	public JButton getBackButtonRegister() {
		return this.backButtonRegister;
	}
	public JFrame getRegisterJFrame() {
		return this.mainFrameRegister;
	}
}
