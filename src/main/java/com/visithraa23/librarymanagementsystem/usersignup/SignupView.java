package com.visithraa23.librarymanagementsystem.usersignup;

import java.util.Scanner;

import com.visithraa23.librarymanagementsystem.util.Util;

public class SignupView {

	private SignupViewModel signupViewModel;

	public SignupView() {
		signupViewModel = new SignupViewModel(this);
	}

	public void signup() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Name:");
		String firstName = sc.nextLine();
		if(Util.isValidName(firstName)) {
			System.out.println("Enter the Last Name:");
			String lastName = sc.nextLine();
			if(Util.isValidName(lastName)) {
				System.out.println("Enter the PhoneNumber");
				String phone = sc.nextLine();
				if(Util.isValidPhoneNumber(phone)) {
					System.out.println("Enter the EmailId");
					String email = sc.nextLine();
					if(Util.isValidEmail(email)) {
						System.out.println("Enter the Password");
						String password = sc.nextLine();
						if(Util.isValidPassword(email)) {
							signupViewModel.signup(firstName, lastName,  phone, email,password);
						}
						else {
							printOut("Enter the Secure Password");
						}
					}else {
						printOut("Invalid Email");
					}
				}else {
					printOut("Invalid phone Number");
				}
			}else {
				printOut("Invalid LastName");
			}
		}else {
			printOut("Invalid FirstName");
		}
		
	}

	public void printOut(String output) {
		System.out.println(output);
	}
}
