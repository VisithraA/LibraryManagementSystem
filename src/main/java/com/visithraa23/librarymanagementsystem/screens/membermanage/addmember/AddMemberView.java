package com.visithraa23.librarymanagementsystem.screens.membermanage.addmember;

import java.util.Scanner;

public class AddMemberView {

	private AddMemberViewModel addMemberViewModel;

	public AddMemberView() {
		addMemberViewModel = new AddMemberViewModel(this);
	}

	public void addMemberDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Member Id:");
		int memberId = sc.nextInt();
		System.out.println("Enter the Name:");
		String memberName = sc.nextLine();
		sc.next();
		System.out.println("Enter the PhoneNumber:");
		long memberPhone = sc.nextLong();
		System.out.println("Enter the Email:");
		String memberEmail = sc.next();
		System.out.println("Enter the Date Of Birth:");
		String memberDOB = sc.next();
		System.out.println("Enter the Joining Date");
		String dateOfJoin = sc.next();
		addMemberViewModel.addMember(memberId, memberName, memberPhone, memberEmail, memberDOB, dateOfJoin);

	}

}
