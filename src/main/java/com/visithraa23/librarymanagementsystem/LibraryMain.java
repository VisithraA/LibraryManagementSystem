package com.visithraa23.librarymanagementsystem;

import java.util.Scanner;

import com.visithraa23.librarymanagementsystem.bookmanage.addbook.AddBookView;
import com.visithraa23.librarymanagementsystem.bookmanage.deletebook.DeleteBookView;
import com.visithraa23.librarymanagementsystem.bookmanage.updatebook.UpdateBookView;
import com.visithraa23.librarymanagementsystem.issueBook.IssueBookView;
import com.visithraa23.librarymanagementsystem.login.LoginView;
import com.visithraa23.librarymanagementsystem.membermanage.addmember.AddMemberView;
import com.visithraa23.librarymanagementsystem.membermanage.deletemember.DeleteMemberView;
import com.visithraa23.librarymanagementsystem.membermanage.updatemember.UpdateMemberView;

public class LibraryMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LoginView loginView = new LoginView();
		
		
		Boolean condition = true;
		Boolean adminLogin = loginView.login();
		if (adminLogin) {
			do {
				System.out.println(
						"\nCategories: \n1.Manage Member \n2.Manage Book \n3.Issue Book \n4.Return Book n5.check Availability \n0.exit ");
				int category = sc.nextInt();
				
				switch (category) {
				
				case 1: {
					Boolean condition2 = true;
					do {
						System.out.println(
								"\n1.Add Member \n2.Update Member Details \n3.Delete Member \n4.GoBack \n0.exit ");
						int member = sc.nextInt();

						switch (member) {
						case 1: {
							AddMemberView addMemberView = new AddMemberView();
							addMemberView.addMemberDetails();
							break;
						}
						case 2: {
							UpdateMemberView updateMemberView = new UpdateMemberView();
							updateMemberView.updateMemberDetails();
							break;
						}
						case 3: {
							DeleteMemberView deleteMemberView = new DeleteMemberView();
							deleteMemberView.deleteMemberDetails();
							break;
						}
						case 4: {
							condition2 = false;
							break;
						}
						case 0: {
							condition2 = false;
							condition = false;
							break;
						}
						default:
							loginView.wrong("Enter the Valid Input...");
						}

					} while (condition2);
					break;
				}

				case 2: {
					Boolean condition2 = true;
					do {
						System.out.println("\n1.Add Book \n2.Update Book Details \n3.Delete Book \n0.exit ");
						int book = sc.nextInt();

						switch (book) {
						case 1: {
							AddBookView addBookView = new AddBookView();
							addBookView.addBook();
							break;
						}
						case 2: {
							UpdateBookView updateBookView = new UpdateBookView();
							updateBookView.updateBookDetails();
							break;
						}
						case 3: {
							DeleteBookView deleteBookView = new DeleteBookView();
							deleteBookView.deleteBook();
							break;
						}
						case 4: {
							condition2 = false;
							break;
						}
						case 0: {
							condition2 = false;
							condition = false;
							break;
						}
						default:
							loginView.wrong("Enter the Valid Input...");
						}
					} while (condition2);
					break;
				}

				case 3:{
					IssueBookView issueBookView=new IssueBookView();
					issueBookView.issueBook();
					break;
				}
				case 4:{
					break;
				}
				case 0: {
					condition=false;
					break;
				}

				default:
					break;
				}
			} while (condition);
		}
	}
}
