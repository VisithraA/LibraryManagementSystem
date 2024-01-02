package com.visithraa23.librarymanagementsystem.signup;

import com.visithraa23.librarymanagementsystem.repository.LibraryRepository;
import com.visithraa23.librarymanagementsystem.util.Util;

public class SignupViewModel {
	private SignupView signupView;
	private LibraryRepository libraryRepository;

	public SignupViewModel(SignupView view) {
		signupView = view;
		libraryRepository = LibraryRepository.getInstance();
	}

	public void signup(String firstName, String lastName, String dob, String phone, String email) {
		
		if (Util.isValidName(firstName)) {
			if (Util.isValidName(lastName)) {
					if(Util.isValidPhoneNumber(phone)) {
						if(Util.isValidDateOfBirth(dob)) {
					}
					else {
						signupView.printOut("Invalid PhoneNumber");
					}
			}
			else {
				signupView.printOut("Invalid LastName");
			}
		} else {
			signupView.printOut("Invalid FirstName");
		}

	}
	}
	
}
