package co.edu.unbosque.thetinderproject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.thetinderproject.model.UserDataBaseModel;
import co.edu.unbosque.thetinderproject.view.MainMenuView;
import co.edu.unbosque.thetinderproject.view.MainView;
import co.edu.unbosque.thetinderproject.view.NewUserDataView;

public class NewUserDataController {
	public NewUserDataController(NewUserDataView NUDView) {
		//BackButton
		NUDView.getBackButtonNewUD().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				NUDView.getMainFrameNewUD().getContentPane().removeAll();
				NUDView.getMainFrameNewUD().repaint();
				NUDView.getMainFrameNewUD().dispose();
				new MainController(new MainView());
			}
		});
		
		NUDView.getSendDataButtonNewUD().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String name = NUDView.getNameFieldNewUD();
					String nationality = NUDView.getNationalityField();
					int age = Integer.parseInt(NUDView.getAgeFieldNewUD());
					String gender = NUDView.getGenderComboBoxNewUD();
					String cityOfResidence = NUDView.getCityOfResidenceNewUD();
					String userDescription = NUDView.getDescriptionFieldNewUD();
					if(name == "") {
						NUDView.setErrorMessageNewUD("Debe ingresar un nombre");
					}
					else if(nationality == "") {
						NUDView.setErrorMessageNewUD("Debe llenar todos los campos");
					}
					else {
						UserDataBaseModel.setUserNewData(name, nationality, age, gender, cityOfResidence, userDescription);
						NUDView.getMainFrameNewUD().getContentPane().removeAll();
						NUDView.getMainFrameNewUD().dispose();
						new MainMenuController(new MainMenuView());
					}
				}
				catch(NumberFormatException x) {
					NUDView.setErrorMessageNewUD("Debe ingresar una edad v�lida");
				}
				
			}
		});
		
	}
}
