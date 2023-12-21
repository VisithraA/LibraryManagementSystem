package com.visithraa23.librarymanagementsystem.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class IssueBook {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int issueDate;
	@OneToOne
	private Book book;
	@OneToOne
	private Member member;

	public int getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(int issueDate) {
		this.issueDate = issueDate;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

}
