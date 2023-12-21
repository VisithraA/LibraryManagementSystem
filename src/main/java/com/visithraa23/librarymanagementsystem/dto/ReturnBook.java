package com.visithraa23.librarymanagementsystem.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ReturnBook {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int returnDate;
	@OneToOne
	private Book book;
	@OneToOne
	private Member member;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(int returnDate) {
		this.returnDate = returnDate;
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
