package co.edu.unbosque.thetinderproject.view;

import java.awt.Font;

import javax.swing.*;

public class MainMenuView {
	//Programadora: Jennifer
	
	JLabel workingUserLabelMMView = new JLabel();
	JLabel mainTextLabelMMView = new JLabel("Menu principal");
	JButton LogOutButtonMMView = new JButton("Cerrar sesión");
	JFrame mainFrameMMView;
	
	public MainMenuView() {
		//Frame settings
		mainFrameMMView = new JFrame();
		mainFrameMMView.setLayout(null);
		mainFrameMMView.setBounds(450, 100, 500, 500);
		mainFrameMMView.setVisible(true);
		
		//MainLabel section
		mainTextLabelMMView.setBounds(70, 20, 400, 40);
		mainTextLabelMMView.setFont(new Font("Serif", Font.BOLD, 20));
		mainFrameMMView.add(mainTextLabelMMView);
	}
	
	public JButton getLogOutButtonMMView() {
		return LogOutButtonMMView;
	}
	public JLabel setWorkingUserLabelMMView() {
		return workingUserLabelMMView;
	}
	
	
		
		
		
		
	}



