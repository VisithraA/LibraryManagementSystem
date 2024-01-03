package com.visithraa23.librarymanagementsystem.screens.member.membermanage.deletemember;

import com.visithraa23.librarymanagementsystem.repository.LibraryRepository;

public class DeleteMemberViewModel {

	private DeleteMemberView deleteMemberView;
	private LibraryRepository libraryRepository;

	public DeleteMemberViewModel(DeleteMemberView view) {
		deleteMemberView = view;
		libraryRepository = LibraryRepository.getInstance();
	}

	public void deleteMemberDetails(int memberId) {
		libraryRepository.deleteMember(memberId);
	}

}
