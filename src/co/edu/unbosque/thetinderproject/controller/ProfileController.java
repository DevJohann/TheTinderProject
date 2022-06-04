package co.edu.unbosque.thetinderproject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import co.edu.unbosque.thetinderproject.model.ProfileModel;
import co.edu.unbosque.thetinderproject.model.UserDataBaseModel;
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
		// RANDOM
		//LikeButton action
		profileView.getLikeProfileView().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//Change random user
				ArrayList<String> userData = UserDataBaseModel.returnRandomUser();	
				profileView.getMainFrameProfileView().repaint();
				profileView.setNameLabelProfileView(userData.get(0));
				profileView.setAgeLabelProfileView(userData.get(1));
				profileView.setDescriptionLabelProfileView(userData.get(2));
				//System.out.println(userData.get(3)); //Debug
				profileView.setPictureSrc(userData.get(3));
				//System.out.println(profileView.getPictureSrc()); //Debug Funciona
				
				//Add Like
				UserDataBaseModel.addLike();
			}
		});
		
	}

}
