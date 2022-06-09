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
		UserDataBaseModel.resetShown(); //Pasar todos los show a falso para que se vuelvan a mostrar
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
		profileView.getLikeProfileView().addActionListener(new ActionListener() { //When WorkingUser likes
			@Override
			public void actionPerformed(ActionEvent e) {
				//Change random user
				boolean success = false;
				while(success == false) { //Repetir hasta que salga uno que cumpla las condiciones (Problema: Si se pasan todos los shown a true, ningun usuario va a cumplir la condición y se ejecuta un bucle infinito)
					try {
						ArrayList<String> userData = UserDataBaseModel.returnRandomUser();	
						profileView.getMainFrameProfileView().repaint();
						profileView.setNameLabelProfileView(userData.get(0));
						profileView.setAgeLabelProfileView(userData.get(1));
						profileView.setDescriptionLabelProfileView(userData.get(2));
						//System.out.println(userData.get(3)); //Debug
						profileView.setPictureSrc(userData.get(3));
						//System.out.println(profileView.getPictureSrc()); //Debug Funciona
						UserDataBaseModel.setShown(true);
						//Add Like
						UserDataBaseModel.addLike();
						success = true;
					}catch(NullPointerException i) {
						success = false;
						System.out.println("Ignorado");
					}	
				}
			}
		});
		//DislikeButton action
		profileView.getDislikeProfileView().addActionListener(new ActionListener() { //When WorkingUser dislikes
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean success = false;
				while(success == false) {
					try {
						ArrayList<String> userData = UserDataBaseModel.returnRandomUser();	
						profileView.getMainFrameProfileView().repaint();
						profileView.setNameLabelProfileView(userData.get(0));
						profileView.setAgeLabelProfileView(userData.get(1));
						profileView.setDescriptionLabelProfileView(userData.get(2));
						//System.out.println(userData.get(3)); //Debug
						profileView.setPictureSrc(userData.get(3));
						//System.out.println(profileView.getPictureSrc()); //Debug Funciona
						success = true;
					}catch(NullPointerException i) {
						success = false;
						System.out.println("Ignorado");
					}	
				}
			}
		});
		
	}

}
