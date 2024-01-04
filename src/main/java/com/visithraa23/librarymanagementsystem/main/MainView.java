package com.visithraa23.librarymanagementsystem.main;

import java.util.Scanner;

import com.visithraa23.librarymanagementsystem.adminlogin.AdminLoginView;
import com.visithraa23.librarymanagementsystem.userlogin.UserLoginView;
import com.visithraa23.librarymanagementsystem.usersignup.SignupView;

public class MainView {
	private MainViewModel mainViewModel;

	public MainView() {
		mainViewModel = new MainViewModel(this);
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		Boolean condition1 = true, condition2 = true;

		do {
			System.out.println("\n1.Admin \n2.User \n0.Exit");
			int user = sc.nextInt();
			switch (user) {
			case 1: {
				AdminLoginView adminLoginView=new AdminLoginView();
				adminLoginView.adminLogin();
				break;
			}
			case 2: {
				do {
					System.out.println("\n1.Signup \n2.Login \n9.Back \n0.Exit");
					int input = sc.nextInt();
					switch (input) {
					case 1: {
						SignupView signupView = new SignupView();
						signupView.signup();
						break;
					}
					case 2: {
						UserLoginView userLoginView=new UserLoginView();
						userLoginView.login();
						break;
					}
					case 9: {
						condition2=false;
						break;
					}
					case 0: {
						condition1=false;
						condition2=false;
						break;
					}
					default:
						System.out.println("Enter the Valid Input....");
						break;
					}
				} while (condition2);
				break;
			}
			case 0:{
				condition1=false;
				break;
			}
			default:
				System.out.println("Enter the valid input...");
				break;
			}
		} while (condition1);
	}
}
