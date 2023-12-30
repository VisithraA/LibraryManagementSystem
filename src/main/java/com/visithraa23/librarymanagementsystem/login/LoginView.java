package com.visithraa23.librarymanagementsystem.login;

import java.util.Scanner;

import com.visithraa23.librarymanagementsystem.screens.membermanage.addmember.AddMemberView;
import com.visithraa23.librarymanagementsystem.screens.membermanage.addmember.AddMemberViewModel;

public class LoginView {
	private LoginViewModel loginViewModel;
	private AddMemberView addMemberView;

	public LoginView() {
		loginViewModel = new LoginViewModel(this);
		addMemberView = new AddMemberView();
	}

	public Boolean login() {
		Scanner sc = new Scanner(System.in);
		
		
			System.out.println("----------Login---------\nUserName:");
			String userName = sc.next();
			System.out.println("Password:");
			String password = sc.next();
			Boolean adminLogin = loginViewModel.checkAdmin(userName, password);
		
		return adminLogin;

	}

	public void wrong(String string) {
		System.out.println(string);
	}
}
