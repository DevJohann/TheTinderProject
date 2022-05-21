package co.edu.unbosque.thetinderproject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.thetinderproject.model.UserDataBaseModel;
import co.edu.unbosque.thetinderproject.view.LoginView;
import co.edu.unbosque.thetinderproject.view.MainMenuView;
import co.edu.unbosque.thetinderproject.view.MainView;
import co.edu.unbosque.thetinderproject.view.NewUserDataView;

public class LoginController {
	//Get credentials from LoginView and forward them to LoginModel (ValidateUser)
	public LoginController(LoginView loginView) {
		loginView.getBackButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				loginView.getMainFrameLogin().getContentPane().removeAll();
				loginView.getMainFrameLogin().repaint();
				loginView.getMainFrameLogin().dispose();
				new MainController(new MainView());
			}
		});
		
		loginView.getSendDataButtonLogin().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String usernameFromLogin = loginView.getUsernameTFieldLogin();
				String passwordFromLogin = loginView.getPasswordTFieldLogin();
				boolean isValid = UserDataBaseModel.validateCredentials(usernameFromLogin, passwordFromLogin);
				
				if(isValid) { //If credentials are correct
					boolean isFirstTimer = UserDataBaseModel.checkFirstTimer(usernameFromLogin);
					if(isFirstTimer) { //And if is first timer
						loginView.getMainFrameLogin().getContentPane().removeAll();
						loginView.getMainFrameLogin().repaint();
						loginView.getMainFrameLogin().dispose();
						//UserDataBaseModel.setFirstTimer(false); the user must fill all the fields before changing this
						new NewUserDataController(new NewUserDataView());
					}
					else {
						loginView.getMainFrameLogin().getContentPane().removeAll();
						loginView.getMainFrameLogin().repaint();
						loginView.getMainFrameLogin().dispose();
						new MainMenuController(new MainMenuView());
					}
				}
				else {
					loginView.getFooterLabelLogin().setText("Credenciales incorrectas");
				}
			}
		});
	}
}
