package com.visithraa23.librarymanagementsystem.screens.member.membermanage.addmember;

import com.visithraa23.librarymanagementsystem.repository.LibraryRepository;

public class AddMemberViewModel {

	private AddMemberView addMemberView;
	private LibraryRepository libraryRepo;

	public AddMemberViewModel(AddMemberView libraryManagementView) {
		addMemberView = libraryManagementView;
		libraryRepo = LibraryRepository.getInstance();
	}

	public void addMember(String firstName, String lastName, String dob, String phone, String email) {
		String memberId = firstName.substring(0, 5) + phone.substring(phone.length() - 4);
		libraryRepo.addMember(memberId, firstName, lastName, dob, phone, email);
		addMemberView.printOut("You are added as member \nYour Member Id : "+memberId);
	}

}
