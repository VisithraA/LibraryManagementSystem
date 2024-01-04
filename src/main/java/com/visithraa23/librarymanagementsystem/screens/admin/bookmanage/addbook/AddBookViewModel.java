package com.visithraa23.librarymanagementsystem.screens.admin.bookmanage.addbook;

import com.visithraa23.librarymanagementsystem.repository.LibraryRepository;

public class AddBookViewModel {

	private AddBookView addBookView;
	private LibraryRepository libraryRepository;

	public AddBookViewModel(AddBookView view) {
		addBookView = view;
		libraryRepository = LibraryRepository.getInstance();
	}

	public void addBook(String bookName, String author, String publisher, byte edition, byte quantity) {
		libraryRepository.addBook(bookName, author, publisher, edition, quantity);
	}

}
