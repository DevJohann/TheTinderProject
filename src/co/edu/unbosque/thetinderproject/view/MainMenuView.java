package co.edu.unbosque.thetinderproject.view;

import java.awt.Font;

import javax.swing.*;

public class MainMenuView {
	//Programadora: Jennifer
	
	JLabel workingUserLabelMMView = new JLabel();
	JLabel mainTextLabelMMView = new JLabel("Menu principal");
	JButton LogOutButtonMMView = new JButton("Cerrar sesión");
	JButton profileButtonMMView = new JButton("Buscar pareja");
	JButton matchButtonMMView = new JButton("Matches");
	JButton preferencesButtonMMView = new JButton("Preferencias");
	JFrame mainFrameMMView;
	
	public MainMenuView() {
		//Frame settings
		mainFrameMMView = new JFrame();
		mainFrameMMView.setLayout(null);
		mainFrameMMView.setBounds(450, 100, 500, 500);
		mainFrameMMView.setVisible(true);
		
		//MainTextLabel section
		mainTextLabelMMView.setBounds(140, 30, 400, 40);
		mainTextLabelMMView.setFont(new Font("Serif", Font.BOLD, 30));
		mainFrameMMView.add(mainTextLabelMMView);
		
		//ProfileButton section
		profileButtonMMView.setBounds(180, 120, 120, 40);
		mainFrameMMView.add(profileButtonMMView);
		
		//MatchButton section
		matchButtonMMView.setBounds(180, 180, 120, 40);
		mainFrameMMView.add(matchButtonMMView);
		
		//PreferencesButton section
		preferencesButtonMMView.setBounds(180, 240, 120, 40);
		mainFrameMMView.add(preferencesButtonMMView);
		
		// LogOutButtonMMView
		LogOutButtonMMView.setBounds(15, 420, 120, 30);
		mainFrameMMView.add(LogOutButtonMMView);
		
		//MainLabel section
		//mainTextLabelMMView.setBounds(150, 20, 400, 40);
		//mainTextLabelMMView.setFont(new Font("Serif", Font.BOLD, 30));
		//mainFrameMMView.add(mainTextLabelMMView);
	}
	
	public JButton getLogOutButtonMMView() {
		return LogOutButtonMMView;
	}
	public JLabel setWorkingUserLabelMMView() {
		return workingUserLabelMMView;
	}
	public JButton getProfileButtonMMView() {
		return profileButtonMMView;
	}
	public JButton getMatchButtonMMView() {
		return matchButtonMMView;
	}
	public JButton getPreferencesButtonMMView() {
		return preferencesButtonMMView;
	}
	public JFrame getMainFrameMMView() {
		return mainFrameMMView;
	}
	
	
		
		
		
		
	}



