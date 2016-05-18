package application.controller;

import application.view.LoginButtonEvent;
import application.view.LoginButtonListener;
import application.view.LoginView;

public class LoginViewController implements LoginButtonListener {
	private LoginView view;
	
	public LoginViewController(LoginView view) {
		this.view = view;
	}

	@Override
	public void buttonEventPerformed(LoginButtonEvent event) {
		System.out.println("Login performed:" + event.getLogin() + " " + event.getPasswd());
	}
}
