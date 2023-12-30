package com.visithraa23.librarymanagementsystem.screens.returnBook;

import com.visithraa23.librarymanagementsystem.repository.LibraryRepository;

public class ReturnBookViewModel {

	private ReturnBookView returnBookView;
	private LibraryRepository libraryRepository;

	public ReturnBookViewModel(ReturnBookView view) {
		returnBookView = view;
		libraryRepository = LibraryRepository.getInstance();
	}

	public void returnBook(int memberId, String memberName, int bookId, String bookName, String returnDate) {
		if (libraryRepository.checkMemberPresent(memberId, memberName)) {
			if (libraryRepository.checkBookPresent(bookId, bookName)) {
				libraryRepository.returnBook(memberId, memberName, bookId, bookName, returnDate);
			} else
				System.out.println("Book Not Found");
		} else {
			System.out.println("Member Not Found");
		}

	}

}
