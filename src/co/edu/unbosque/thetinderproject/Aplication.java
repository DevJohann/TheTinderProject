package co.edu.unbosque.thetinderproject;

import co.edu.unbosque.thetinderproject.controller.MainController;
import co.edu.unbosque.thetinderproject.view.LoginView;
import co.edu.unbosque.thetinderproject.view.MainView;
import co.edu.unbosque.thetinderproject.view.RegisterView;

public class Aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainView view = new MainView();
		LoginView loginView = new LoginView();
		RegisterView registerView = new RegisterView();
		MainController controller = new MainController(view, loginView, registerView);
	}

}
