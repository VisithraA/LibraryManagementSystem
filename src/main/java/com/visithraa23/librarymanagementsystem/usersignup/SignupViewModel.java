package com.visithraa23.librarymanagementsystem.usersignup;

import com.visithraa23.librarymanagementsystem.repository.LibraryRepository;
import com.visithraa23.librarymanagementsystem.util.Util;

public class SignupViewModel {
	private SignupView signupView;
	private LibraryRepository libraryRepository;

	public SignupViewModel(SignupView view) {
		signupView = view;
		libraryRepository = LibraryRepository.getInstance();
	}

	public void signup(String firstName, String lastName,String phone, String email,String password) {
		
		libraryRepository.createAccount(firstName,lastName,phone,email,password);
		
		signupView.printOut("Successful!");
	}
	
}
