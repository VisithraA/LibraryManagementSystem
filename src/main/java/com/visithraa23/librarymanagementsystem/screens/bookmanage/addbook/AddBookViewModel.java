package com.visithraa23.librarymanagementsystem.screens.bookmanage.addbook;

import com.visithraa23.librarymanagementsystem.repository.LibraryRepository;

public class AddBookViewModel {

	private AddBookView addBookView;
	private LibraryRepository libraryRepository;

	public AddBookViewModel(AddBookView view) {
		addBookView = view;
		libraryRepository = LibraryRepository.getInstance();
	}

	public void addBook(int bookId, String bookName, String author, String publisher, byte edition, byte quantity) {
		libraryRepository.addBook(bookId, bookName, author, publisher, edition, quantity);
	}

}
