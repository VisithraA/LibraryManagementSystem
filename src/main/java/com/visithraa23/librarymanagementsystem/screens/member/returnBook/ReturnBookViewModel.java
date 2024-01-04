package com.visithraa23.librarymanagementsystem.screens.member.returnBook;

import com.visithraa23.librarymanagementsystem.dto.Book;
import com.visithraa23.librarymanagementsystem.dto.Member;
import com.visithraa23.librarymanagementsystem.repository.LibraryRepository;

public class ReturnBookViewModel {

	private ReturnBookView returnBookView;
	private LibraryRepository libraryRepository;

	public ReturnBookViewModel(ReturnBookView view) {
		returnBookView = view;
		libraryRepository = LibraryRepository.getInstance();
	}

	public void returnBook(String memberId, int bookId) {
		Member member=libraryRepository.checkMemberPresent(memberId);
		Book book=libraryRepository.checkBookPresent(bookId);
		if (member!=null) {
			if (book!=null) {
				libraryRepository.returnBook(member, book);
			} else
				System.out.println("Book Not Found");
		} else {
			System.out.println("Member Not Found");
		}

	}

}
