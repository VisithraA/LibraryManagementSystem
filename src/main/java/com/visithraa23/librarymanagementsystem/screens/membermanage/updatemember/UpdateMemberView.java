package com.visithraa23.librarymanagementsystem.screens.membermanage.updatemember;

import java.util.Scanner;

public class UpdateMemberView {

	private UpdateMemberViewModel updateMemberViewModel;

	public UpdateMemberView() {
		updateMemberViewModel = new UpdateMemberViewModel(this);
	}

	public void updateMemberDetails() {
		Boolean condition;
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"----Update Member Details----\n1.Id \n2.Name \n3.PhoneNumber \n4.Email \n5.Date Of Birth \n6.Joined Date \n0.exit");
		int update = sc.nextInt();
		System.out.println("Enter the Id");
		int memberId = sc.nextInt();
		switch (update) {
		case 1: {
			System.out.println("Enter the New Id");
			int newMemberId = sc.nextInt();
			updateMemberViewModel.updateId(memberId, newMemberId);
			break;
		}
		case 2: {
			System.out.println("Enter the New Name");
			String newName = sc.nextLine();
			updateMemberViewModel.updateName(memberId, newName);
			break;
		}
		case 3: {
			break;
		}
		case 4: {
			break;
		}
		case 5: {
			break;
		}
		case 6: {
			break;
		}
		case 0: {
			condition = false;
			break;
		}
		default:
			System.out.println("Enter the Valid Input....");

		}
	}

}
