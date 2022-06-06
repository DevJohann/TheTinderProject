package co.edu.unbosque.thetinderproject.controller;

import java.awt.event.ActionEvent;
import co.edu.unbosque.thetinderproject.model.MatchModel;
import co.edu.unbosque.thetinderproject.model.PreferencesModel;
import co.edu.unbosque.thetinderproject.view.MatchView;
import co.edu.unbosque.thetinderproject.view.PreferencesView;

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
		//Match button
		mainMenuView.getMatchButtonMMView().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainMenuView.getMainFrameMMView().getContentPane().removeAll();
				mainMenuView.getMainFrameMMView().dispose();
				new MatchController(new MatchView(), new MatchModel());
			}
		});
		
		//Preferences Button
		mainMenuView.getPreferencesButtonMMView().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainMenuView.getMainFrameMMView().getContentPane().removeAll();
				mainMenuView.getMainFrameMMView().dispose();
				new PreferencesController(new PreferencesView(), new PreferencesModel());
			}
			
		});
		
		//Logout button
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
