package co.edu.unbosque.thetinderproject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.thetinderproject.model.ProfileModel;
import co.edu.unbosque.thetinderproject.view.MainMenuView;
import co.edu.unbosque.thetinderproject.view.MainView;
import co.edu.unbosque.thetinderproject.view.ProfileView;

public class MainMenuController {
	public MainMenuController(MainMenuView mainMenuView) {
		
		mainMenuView.getProfileButtonMMView().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainMenuView.getMainFrameMMView().getContentPane().removeAll();
				mainMenuView.getMainFrameMMView().dispose();
				new ProfileController(new ProfileView(), new ProfileModel());
			}
		});
		
		mainMenuView.getLogOutButtonMMView().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainMenuView.getMainFrameMMView().getContentPane().removeAll();
				mainMenuView.getMainFrameMMView().dispose();
				new MainController(new MainView());
			}
		});
		
	}
}
