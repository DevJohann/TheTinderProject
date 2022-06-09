package co.edu.unbosque.thetinderproject.controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import co.edu.unbosque.thetinderproject.model.PreferencesModel;
import co.edu.unbosque.thetinderproject.model.UserDataBaseModel;
import co.edu.unbosque.thetinderproject.view.MainMenuView;
import co.edu.unbosque.thetinderproject.view.MainView;
import co.edu.unbosque.thetinderproject.view.PreferencesView;

public class PreferencesController {
	
	PreferencesController(PreferencesView preferencesView, PreferencesModel preferencesModel ){
		
		//BackButton
		preferencesView.getBackButtonPreferences().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				preferencesView.getMainFramePreferencesView().getContentPane().removeAll();
				preferencesView.getMainFramePreferencesView().repaint();
				preferencesView.getMainFramePreferencesView().dispose();
				new MainMenuController(new MainMenuView());
			}
			
		});
		
		preferencesView.getSendDataButtonPreferences().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UserDataBaseModel.addPreferences(preferencesView.getCityPreferenceBox(), preferencesView.getGenderPreferenceBox(), preferencesView.getAgePreferenceBox());
				preferencesView.setConfirmLabel("Preferencias aplicadas");
			}
			
		});
	
		
	}

}
