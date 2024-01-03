package com.visithraa23.librarymanagementsystem.userlogin;

import com.visithraa23.librarymanagementsystem.dto.User;
import com.visithraa23.librarymanagementsystem.repository.LibraryRepository;

public class UserLoginViewModel {
	private UserLoginView loginView;
	private LibraryRepository repository;

	public UserLoginViewModel(UserLoginView view) {
		loginView = view;
		repository = LibraryRepository.getInstance();
	}

	public boolean login(String userName, String password) {
		User user = repository.findUser(userName);
		if (user!=null&&user.getFirstName().equals(userName)) {
			if (user.getPassword().equals(password)) {
				loginView.printOut("Login Successfull");
				return true;
			} else {
				loginView.printOut("Invalid Password");
			}
		} else {
			loginView.printOut("User not found");
		}
		return false;
	}

}
