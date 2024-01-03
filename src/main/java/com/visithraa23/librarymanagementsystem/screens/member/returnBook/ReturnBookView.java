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
		int memberId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Member Name");
		String memberName = sc.nextLine();
		System.out.println("Enter the book Id");
		int bookId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the book name");
		String bookName = sc.nextLine();
		System.out.println("Enter the Date");
		String returnDate = sc.next();
		bookviewModel.returnBook(memberId, memberName, bookId, bookName, returnDate);
	}

}
