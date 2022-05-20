package co.edu.unbosque.thetinderproject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.thetinderproject.view.LoginView;
import co.edu.unbosque.thetinderproject.view.MainView;

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
	}
}
