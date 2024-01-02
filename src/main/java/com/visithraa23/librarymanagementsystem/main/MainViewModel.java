package com.visithraa23.librarymanagementsystem.main;

import com.visithraa23.librarymanagementsystem.repository.LibraryRepository;

public class MainViewModel {
	private MainView mainView;
	private LibraryRepository repository;
	
	public MainViewModel(MainView view) {
		repository = LibraryRepository.getInstance();
	}

}
