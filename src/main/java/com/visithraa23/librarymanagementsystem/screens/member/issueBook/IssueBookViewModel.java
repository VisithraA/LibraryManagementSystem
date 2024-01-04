package com.visithraa23.librarymanagementsystem.screens.member.issueBook;

import com.visithraa23.librarymanagementsystem.dto.Book;
import com.visithraa23.librarymanagementsystem.dto.Member;
import com.visithraa23.librarymanagementsystem.repository.LibraryRepository;

public class IssueBookViewModel {
	private IssueBookView issueBookView;
	private LibraryRepository libraryRepository;

	public IssueBookViewModel(IssueBookView view) {
		issueBookView = view;
		libraryRepository = LibraryRepository.getInstance();
	}

	public void issueBook(String memberId, int bookId) {
		Member member=libraryRepository.checkMemberPresent(memberId);
		Book book=libraryRepository.checkBookPresent(bookId);
		if (member!=null) {
			if (book!=null) {
				libraryRepository.issueBook(member, book);
			} else
				System.out.println("Book Not Found");
		} else {
			System.out.println("Member Not Found");
		}

	}

}
