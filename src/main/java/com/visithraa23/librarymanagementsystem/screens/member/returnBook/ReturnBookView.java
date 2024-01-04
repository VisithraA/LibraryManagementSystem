package com.visithraa23.librarymanagementsystem.screens.member.returnBook;

import java.util.Scanner;

public class ReturnBookView {

	private ReturnBookViewModel bookviewModel;

	public ReturnBookView() {
		bookviewModel = new ReturnBookViewModel(this);
	}

	public void returnBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Member Id");
		String  memberId = sc.nextLine();
		System.out.println("Enter the book Id");
		int bookId = sc.nextInt();
		bookviewModel.returnBook(memberId, bookId);
	}

}
