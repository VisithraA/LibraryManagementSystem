package com.visithraa23.librarymanagementsystem.screens.issueBook;

import com.visithraa23.librarymanagementsystem.repository.LibraryRepository;

public class IssueBookViewModel {
	private IssueBookView issueBookView;
	private LibraryRepository libraryRepository;

	public IssueBookViewModel(IssueBookView view) {
		issueBookView = view;
		libraryRepository = LibraryRepository.getInstance();
	}

	public void issueBook(int memberId, String memberName, int bookId, String bookName, String issueDate) {
		if (libraryRepository.checkMemberPresent(memberId, memberName)) {
			if (libraryRepository.checkBookPresent(bookId, bookName)) {
				libraryRepository.issueBook(memberId, memberName, bookId, bookName, issueDate);
			} else
				System.out.println("Book Not Found");
		} else {
			System.out.println("Member Not Found");
		}

	}

}
