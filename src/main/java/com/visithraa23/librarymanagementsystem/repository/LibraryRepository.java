package com.visithraa23.librarymanagementsystem.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.visithraa23.librarymanagementsystem.dto.Book;
import com.visithraa23.librarymanagementsystem.dto.Member;
import com.visithraa23.librarymanagementsystem.login.LoginView;

public class LibraryRepository {

	private static LibraryRepository libraryRepository;

	public static LibraryRepository getInstance() {
		if (libraryRepository == null) {
			libraryRepository = new LibraryRepository();
		}
		return libraryRepository;
	}

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void addBook(int bookId, String bookName, String author, String publisher, byte edition, byte quantity) {
		Book book = new Book();
		book.setBookId(bookId);
		book.setBookName(bookName);
		book.setAuthor(author);
		book.setPublisher(publisher);
		book.setEdition(edition);
		book.setQuantity(quantity);
		entityTransaction.begin();
		entityManager.persist(book);
		entityTransaction.commit();
	}

	public void updateBook() {
		// TODO Auto-generated method stub

	}

	public void deleteBook(int bookId) {
		Book book=entityManager.find(Book.class, bookId);
		if(book!=null) {
			entityTransaction.begin();
			entityManager.remove(book);
			entityTransaction.commit();
		}
		else {
			System.out.println("ID not found");
		}
	}

	public void addMember(int memberId, String memberName, long memberPhone, String memberEmail, String memberDOB,
			String dateOfJoin) {
		Member member = new Member();
		member.setId(memberId);
		member.setName(memberName);
		member.setPhoneNumber(memberPhone);
		member.setEmail(memberEmail);
		member.setDob(memberDOB);
		member.setJoinDate(dateOfJoin);

		entityTransaction.begin();
		entityManager.persist(member);
		entityTransaction.commit();

		System.out.println("!Data Successfully Added");
	}

	public void deleteMember(int memberId) {
		Member member = entityManager.find(Member.class, memberId);
		if (member != null) {
			entityTransaction.begin();
			entityManager.remove(member);
			entityTransaction.commit();
		}

	}

	public void updateId(int memberId, int newMemberId) {
		Member member = entityManager.find(Member.class, memberId);
		if (member != null) {
			member.setId(newMemberId);
			entityTransaction.begin();
			entityManager.merge(member);
			entityTransaction.commit();
		} else {
			System.out.println("Id Not Found");
		}
	}

	public void updateName(int memberId, String newName) {
		Member member = entityManager.find(Member.class, memberId);
		if (member != null) {
			member.setName(newName);
			entityTransaction.begin();
			entityManager.merge(member);
			entityTransaction.commit();
		} else {
			System.out.println("Id Not Found");
		}
	}

}
