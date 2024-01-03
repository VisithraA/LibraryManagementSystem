package com.visithraa23.librarymanagementsystem.screens.member.membermanage.deletemember;

import java.util.Scanner;

public class DeleteMemberView {
	private DeleteMemberViewModel deleteMemberViewModel;

	public DeleteMemberView() {
		deleteMemberViewModel = new DeleteMemberViewModel(this);
	}

	public void deleteMemberDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Member Id");
		int memberId = sc.nextInt();
		deleteMemberViewModel.deleteMemberDetails(memberId);
	}
}
