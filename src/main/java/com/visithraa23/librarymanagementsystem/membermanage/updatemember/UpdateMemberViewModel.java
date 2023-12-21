package com.visithraa23.librarymanagementsystem.membermanage.updatemember;

import com.visithraa23.librarymanagementsystem.repository.LibraryRepository;

public class UpdateMemberViewModel {

	private UpdateMemberView updateMemberView;
	private LibraryRepository libraryRepository;

	public UpdateMemberViewModel(UpdateMemberView view) {
		updateMemberView = view;
		libraryRepository=LibraryRepository.getInstance();
	}

	public void updateId(int memberId, int newMemberId) {
		libraryRepository.updateId(memberId,newMemberId);
	}

	public void updateName(int memberId, String newName) {
		libraryRepository.updateName(memberId,newName);
	}

}
