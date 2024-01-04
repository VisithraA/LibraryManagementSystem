package com.visithraa23.librarymanagementsystem.screens.member.issueBook;

import java.util.Scanner;

public class IssueBookView {
	private IssueBookViewModel issueBookViewModel;

	public IssueBookView() {
		issueBookViewModel = new IssueBookViewModel(this);
	}

	public void issueBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Member Id");
		String memberId = sc.nextLine();
		System.out.println("Enter the book Id");
		int bookId = sc.nextInt();
		
		issueBookViewModel.issueBook(memberId, bookId);
	}
}
