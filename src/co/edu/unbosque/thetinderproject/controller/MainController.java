package co.edu.unbosque.thetinderproject.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.thetinderproject.view.*;

public class MainController {
	public MainController(MainView view, LoginView loginView) {
		view.getLoginButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getMainFrame().getContentPane().removeAll();
				view.getMainFrame().repaint();
				//loginView.show();
			}
		});
	}
}
