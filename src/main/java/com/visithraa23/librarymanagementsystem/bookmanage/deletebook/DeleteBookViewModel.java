package com.visithraa23.librarymanagementsystem.bookmanage.deletebook;

import com.visithraa23.librarymanagementsystem.repository.LibraryRepository;

public class DeleteBookViewModel {

	private DeleteBookView deleteBookView;
	private LibraryRepository libraryRepository;

	public DeleteBookViewModel(DeleteBookView view) {
		deleteBookView = view;
		libraryRepository = LibraryRepository.getInstance();
	}

	public void deleteBook(int bookId) {
		libraryRepository.deleteBook(bookId);
	}

}
