package co.edu.unbosque.thetinderproject.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.thetinderproject.model.RegisterModel;
import co.edu.unbosque.thetinderproject.view.*;

//Programador Johann
public class MainController {
	public MainController(MainView view) {
		//Login Button
		view.getLoginButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getMainFrame().getContentPane().removeAll();
				view.getMainFrame().repaint();
				view.getMainFrame().dispose();
				new LoginController(new LoginView());
			}
		});
		
		//Register Button
		view.getRegisterButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getMainFrame().getContentPane().removeAll();
				view.getMainFrame().repaint();
				view.getMainFrame().dispose();
				new RegisterController(new RegisterView(), new RegisterModel());
				//registerView.show();
			}
		});
	}
}
