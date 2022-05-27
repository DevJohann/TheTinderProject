package co.edu.unbosque.thetinderproject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.thetinderproject.model.ProfileModel;
import co.edu.unbosque.thetinderproject.view.MainMenuView;
import co.edu.unbosque.thetinderproject.view.ProfileView;

public class ProfileController {
	
	public ProfileController(ProfileView profileView, ProfileModel profileModel){
		//BackButton action
		profileView.getBackButtonProfileView().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				profileView.getMainFrameProfileView().getContentPane().removeAll();
				profileView.getMainFrameProfileView().dispose();
				new MainMenuController(new MainMenuView());
			}
		});
		
		//LikeButton action
		profileView.getLikeProfileView().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}

}
