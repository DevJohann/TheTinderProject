package co.edu.unbosque.thetinderproject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.thetinderproject.view.MainView;
import co.edu.unbosque.thetinderproject.view.RegisterView;

public class RegisterController {
	//Retrieve RegisterView data and forward it to RegisterModel (addUser)
	public RegisterController(RegisterView registerView) {
		registerView.getBackButtonRegister().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				registerView.getRegisterJFrame().getContentPane().removeAll();
				registerView.getRegisterJFrame().repaint();
				registerView.getRegisterJFrame().dispose();
				new MainController(new MainView());
			}
		});
	}
}
