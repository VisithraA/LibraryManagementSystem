package com.visithraa23.librarymanagementsystem.screens.admin.bookmanage.addbook;

import java.util.Scanner;

public class AddBookView {

	private AddBookViewModel addBookViewModel;

	public AddBookView() {
		addBookViewModel = new AddBookViewModel(this);
	}

	public void addBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Book Name");
		String bookName = sc.nextLine();
		System.out.println("Enter the Author");
		String author = sc.nextLine();
		System.out.println("Enter the Publisher");
		String publisher = sc.nextLine();
		System.out.println("Enter the Edition");
		byte edition = sc.nextByte();
		System.out.println("Enter the Quantity");
		byte quantity = sc.nextByte();

		addBookViewModel.addBook( bookName, author, publisher, edition, quantity);
	}

}
