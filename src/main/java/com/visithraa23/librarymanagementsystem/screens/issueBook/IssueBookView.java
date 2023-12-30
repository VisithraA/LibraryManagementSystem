package com.visithraa23.librarymanagementsystem.screens.issueBook;

import java.util.Scanner;

public class IssueBookView {
	private IssueBookViewModel issueBookViewModel;

	public IssueBookView() {
		issueBookViewModel = new IssueBookViewModel(this);
	}

	public void issueBook() {
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
		String issueDate = sc.next();
		issueBookViewModel.issueBook(memberId, memberName, bookId, bookName, issueDate);
	}
}
