package com.visithraa23.librarymanagementsystem.adminlogin;

import com.visithraa23.librarymanagementsystem.repository.LibraryRepository;

public class AdminLoginViewModel {

	private AdminLoginView adminLoginView;
	private LibraryRepository repository;
	
	public AdminLoginViewModel(AdminLoginView view) {
		adminLoginView=view;
		repository=LibraryRepository.getInstance();
	}

	public Boolean checkAdmin(String admin, String pw) {
		String adminName="Admin";
		String password="123";
		if (adminName.equals(admin)) {
			if (password.equals(pw)) {
				return true;
			} else {
				adminLoginView.printOut("Invalid Password");
			}
		} else
			adminLoginView.printOut("Invalid UserName or Password");
		return false;	
	}

}
