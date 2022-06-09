package co.edu.unbosque.thetinderproject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import co.edu.unbosque.thetinderproject.model.MatchModel;
import co.edu.unbosque.thetinderproject.model.UserDataBaseModel;
import co.edu.unbosque.thetinderproject.view.MainMenuView;
import co.edu.unbosque.thetinderproject.view.MatchView;

public class MatchController {
	public MatchController(MatchView matchView, MatchModel matchModel) {
		try {
			matchView.setFirstMatchView(UserDataBaseModel.retrieveWUMatchesDB().get(0).getNameUM());	
		}catch(IndexOutOfBoundsException e) {
			
		}
		
		//BackButton action
		matchView.getBackButtonMatchView().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				matchView.getMainFrameMatchView().removeAll();
				matchView.getMainFrameMatchView().dispose();
				new MainMenuController(new MainMenuView());
			}
		});
	}
}
