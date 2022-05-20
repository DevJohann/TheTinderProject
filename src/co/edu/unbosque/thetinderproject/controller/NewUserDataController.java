package co.edu.unbosque.thetinderproject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
	}
}
