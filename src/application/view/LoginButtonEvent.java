package application.view;

public class LoginButtonEvent {

	private String login, passwd;
	
	public LoginButtonEvent(String login, String passwd) {
		this.login = login;
		this.passwd = passwd;
	}

	public String getLogin() {
		return login;
	}

	public String getPasswd() {
		return passwd;
	}
}
