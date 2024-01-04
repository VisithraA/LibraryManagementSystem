package com.visithraa23.librarymanagementsystem.adminlogin;

import java.util.Scanner;

import com.visithraa23.librarymanagementsystem.main.MainView;
import com.visithraa23.librarymanagementsystem.screens.admin.bookmanage.addbook.AddBookView;
import com.visithraa23.librarymanagementsystem.screens.admin.bookmanage.deletebook.DeleteBookView;
import com.visithraa23.librarymanagementsystem.screens.admin.bookmanage.updatebook.UpdateBookView;
import com.visithraa23.librarymanagementsystem.screens.admin.searchbook.SearchBookView;

public class AdminLoginView {
	private AdminLoginViewModel adminLoginViewModel;

	public AdminLoginView() {
		adminLoginViewModel = new AdminLoginViewModel(this);
	}

	public void adminLogin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User Name");
		String admin = sc.nextLine();
		System.out.println("Enter the Password");
		String password = sc.nextLine();
		Boolean adminLogin = adminLoginViewModel.checkAdmin(admin, password);
		if (adminLogin) {
			Boolean condition = true, condition1 = true;
			;
			do {
				System.out.println(
						"\n1.Manage Book \n2.Search Member \n3.SearchBook \n4.Issued Book Details \n0.Exit");
				int adminInput = sc.nextInt();
				switch (adminInput) {
				case 1: {
					do {
						System.out.println("\n1.Add Book \n2.Update Book \n3.Delete Book \n9.Back \n0.Exit");
						int bookInput = sc.nextInt();
						switch (bookInput) {
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
						case 9: {
							condition1 = false;
							break;
						}
						case 0: {
							System.exit(0);
						}
						default:
							System.out.println("Enter the Valid Input..");
							break;
						}

					} while (condition1);
					break;
				}
				case 3: {
					SearchBookView searchBookView = new SearchBookView();
					break;
				}
				case 9: {
					condition = false;
					break;
				}
				case 0:{
					System.exit(0);
				}
				default:
					System.out.println("Enter the valid input");
					break;
				}
			} while (condition);
		} else {
			System.out.println("-----------");
		}
	}

	public void printOut(String string) {
		System.out.println(string);
	}

}
