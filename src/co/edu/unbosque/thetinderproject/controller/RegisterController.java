package co.edu.unbosque.thetinderproject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.thetinderproject.model.RegisterModel;
import co.edu.unbosque.thetinderproject.model.UserDataBaseModel;
import co.edu.unbosque.thetinderproject.view.LoginView;
import co.edu.unbosque.thetinderproject.view.MainView;
import co.edu.unbosque.thetinderproject.view.RegisterView;

public class RegisterController {
	//Retrieve RegisterView data and forward it to RegisterModel (addUser)
	public RegisterController(RegisterView registerView, RegisterModel registerModel) {
		registerView.getBackButtonRegister().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				registerView.getRegisterJFrame().getContentPane().removeAll();
				registerView.getRegisterJFrame().repaint();
				registerView.getRegisterJFrame().dispose();
				new MainController(new MainView());
				
			}
		});
		registerView.getSendDataButtonRegister().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String username = registerView.getNameRegister();
				String password =  registerView.getPasswordRegister();
				boolean isRepeated = UserDataBaseModel.checkRepeated(username);
				if(isRepeated) {
					registerView.getErrorLabelRegister();
				}
				else {
					registerModel.addUserRM(username, password);
					registerView.getRegisterJFrame().getContentPane().removeAll();
					registerView.getRegisterJFrame().dispose();
					new LoginController(new LoginView());
				}
			
			}
			
			
		});
	
	}
	
	
}
