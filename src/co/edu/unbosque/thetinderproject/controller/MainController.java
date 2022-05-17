package co.edu.unbosque.thetinderproject.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.thetinderproject.view.*;

//Programador Johann
public class MainController {
	public MainController(MainView view, LoginView loginView, RegisterView registerView) {
		//Login Button
		view.getLoginButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getMainFrame().getContentPane().removeAll();
				view.getMainFrame().repaint();
				//loginView.show();
			}
		});
		
		//Register Button
		view.getRegisterButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getMainFrame().getContentPane().removeAll();
				view.getMainFrame().repaint();
				//registerView.show();
			}
		});
	}
}
