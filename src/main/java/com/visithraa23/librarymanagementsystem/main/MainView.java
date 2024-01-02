package com.visithraa23.librarymanagementsystem.main;

import java.util.Scanner;

import com.visithraa23.librarymanagementsystem.signup.SignupView;

public class MainView {
	private MainViewModel mainViewModel;

	public MainView() {
		mainViewModel = new MainViewModel(this);
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		Boolean condition = true;

		do {
			System.out.println("1.Signup \n2.Login \n3.Exit");
			int input = sc.nextInt();
			
			switch (input) {
			case 1:{
				SignupView signupView=new SignupView();
				signupView.signup();
				break;
			}
			case 2:{
				break;
			}
			default:
				System.out.println("Enter the Valid Input....");
				break;
			}
		} while (condition);
	}
}
