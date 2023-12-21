package com.visithraa23.librarymanagementsystem.membermanage.addmember;

import com.visithraa23.librarymanagementsystem.repository.LibraryRepository;

public class AddMemberViewModel {

	private AddMemberView libraryManageView;
	private LibraryRepository libraryRepo;

	public AddMemberViewModel(AddMemberView libraryManagementView) {
		libraryManageView = libraryManagementView;
		libraryRepo = LibraryRepository.getInstance();
	}

	public void addMember(int memberId, String memberName, long memberPhone, String memberEmail, String memberDOB,
			String dateOfJoin) {
		libraryRepo.addMember(memberId, memberEmail, memberPhone, memberEmail, memberDOB, dateOfJoin);
	}

}
