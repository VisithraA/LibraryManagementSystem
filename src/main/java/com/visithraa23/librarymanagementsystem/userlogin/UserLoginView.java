package com.visithraa23.librarymanagementsystem.userlogin;

import java.util.Scanner;

import com.visithraa23.librarymanagementsystem.screens.admin.searchbook.SearchBookView;
import com.visithraa23.librarymanagementsystem.screens.member.membermanage.addmember.AddMemberView;
import com.visithraa23.librarymanagementsystem.screens.member.membermanage.deletemember.DeleteMemberView;
import com.visithraa23.librarymanagementsystem.screens.member.membermanage.updatemember.UpdateMemberView;

public class UserLoginView {
	private UserLoginViewModel loginViewModel;

	public UserLoginView() {
		loginViewModel = new UserLoginViewModel(this);
	}

	public void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the UserName");
		String userName = sc.nextLine();
		System.out.println("Enter the password");
		String password = sc.next();
		Boolean login = loginViewModel.login(userName, password);
		if (login) {
			Boolean condition = true;
			do {
				System.out.println("\n1.Manage Member \n2.Search Book \n3.Issue Book \n4.Return Book \n0.Exit");
				int memberInput=sc.nextInt();
				Boolean condition1=true;
				switch (memberInput) {
				case 1:{
					do {
						System.out.println("\n1.Add Member \n2.Update Member \n3.Delete Member \n9.Back \n0.Exit");
						int input=sc.nextInt();
						switch (input) {
						case 1:{
							AddMemberView addMemberView=new AddMemberView();
							addMemberView.addMemberDetails();
							break;
						}
						case 2:{
							UpdateMemberView updateMemberView=new UpdateMemberView();
							updateMemberView.updateMemberDetails();
							break;
						}
						case 3:{
							DeleteMemberView deleteMemberView=new DeleteMemberView();
							deleteMemberView.deleteMemberDetails();
							break;
						}
						case 9:{
							condition1=false;
							break;
						}
						case 0:{
							condition1=false;
							condition=false;
							break;
						}
						default:
							System.out.println("Enter the valid input");
							break;
						}
					} while (condition1);
					break;
				}
				case 2:{
					SearchBookView searchBookView=new SearchBookView();
					break;
				}
				case 3:{

					break;
				}
				case 0:{
					condition=false;
					break;
				}
				default:
					break;
				}
			} while (condition);
		} else {
			System.out.println("You don't have an account. create Account...");
		}

	}

	public void printOut(String string) {
		System.out.println(string);
	}

}
