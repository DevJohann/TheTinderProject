package co.edu.unbosque.thetinderproject.controller;

import java.util.ArrayList;

import co.edu.unbosque.thetinderproject.model.MatchModel;
import co.edu.unbosque.thetinderproject.model.UserDataBaseModel;
import co.edu.unbosque.thetinderproject.view.MatchView;

public class MatchController {
	public MatchController(MatchView matchView, MatchModel matchModel) {
		ArrayList<String> retrievedData = UserDataBaseModel.retrieveMatchedDB();
		matchView.setFirstMatchView(retrievedData.get(0));
		matchView.setFirstAgeMatchView(retrievedData.get(1));
	}
}
