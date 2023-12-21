package com.visithraa23.librarymanagementsystem.login;

public class LoginViewModel {
	private LoginView loginView;

	public LoginViewModel(LoginView view) {
		loginView = view;
	}

	public Boolean checkAdmin(String userName, String password) {
		String user = "AdminOfLibrary";
		String pw = "Admin@123";
		if (userName.equals(user)) {
			if (password.equals(pw)) {
				return true;
			} else {
				loginView.wrong("Invalid Password");
			}
		} else
			loginView.wrong("Invalid UserName or Password");
		return false;
	}

}
