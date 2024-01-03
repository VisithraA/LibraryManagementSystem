package com.visithraa23.librarymanagementsystem.repository;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.visithraa23.librarymanagementsystem.dto.Book;
import com.visithraa23.librarymanagementsystem.dto.IssueBook;
import com.visithraa23.librarymanagementsystem.dto.Member;
import com.visithraa23.librarymanagementsystem.dto.ReturnBook;
import com.visithraa23.librarymanagementsystem.dto.User;
import com.visithraa23.librarymanagementsystem.screens.member.returnBook.ReturnBookView;
import com.visithraa23.librarymanagementsystem.userlogin.UserLoginView;

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

	public void updateBook() {
		// TODO Auto-generated method stub

	}

	public void deleteBook(int bookId) {
		Book book = entityManager.find(Book.class, bookId);
		if (book != null) {
			entityTransaction.begin();
			entityManager.remove(book);
			entityTransaction.commit();
		} else {
			System.out.println("ID not found");
		}
	}

	public void deleteMember(int memberId) {
		Query member = entityManager.createQuery("select mem.* from Member mem where mem.memberId= ?1").setParameter(1,
				memberId);
		if (member != null) {
			entityTransaction.begin();
			entityManager.remove(member);
			entityTransaction.commit();
		} else {
			System.out.println("Id not found");
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
			member.setFirstName(newName);
			entityTransaction.begin();
			entityManager.merge(member);
			entityTransaction.commit();
		} else {
			System.out.println("Id Not Found");
		}
	}

	public boolean checkMemberPresent(int memberId, String memberName) {
		Member checkId = entityManager.find(Member.class, memberId);
		// Member checkName=entityManager.find(Member.class, memberName);
		if (checkId == null) {
			System.out.println("Id not Found...");
		}

		else {
			if ((checkId.getFirstName().equals(memberName)))
				return true;

		}

		return false;
	}

	public boolean checkBookPresent(int bookId, String bookName) {
		Book checkId = entityManager.find(Book.class, bookId);
		if (checkId == null) {
			System.out.println("Id not Found...");
			return false;
		}
		if (checkId.getBookName().equals(bookName))
			return true;
		return false;
	}

	public void issueBook(int memberId, String memberName, int bookId, String bookName, String issueDate) {
		IssueBook issue = new IssueBook();
		issue.setBookId(bookId);
		issue.setBookName(bookName);
		issue.setMemberId(memberId);
		issue.setMemberName(memberName);
		issue.setIssueDate(issueDate);

		entityTransaction.begin();
		entityManager.persist(issue);
		entityTransaction.commit();
	}

	public void returnBook(int memberId, String memberName, int bookId, String bookName, String returnDate) {
		ReturnBook returnBook = new ReturnBook();
		returnBook.setBookId(bookId);
		returnBook.setBookName(bookName);
		returnBook.setMemberId(memberId);
		returnBook.setMemberName(memberName);
		returnBook.setReturnDate(bookId);

		entityTransaction.begin();
		entityManager.persist(returnBook);
		entityTransaction.commit();
	}

	// start from that newly
	public void createAccount(String firstName, String lastName, String phone, String email, String password) {
		User user = new User();
		user.setLastName(lastName);
		user.setFirstName(firstName);
		user.setPhoneNumber(phone);
		user.setEmail(email);
		user.setPassword(password);
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
	}

	public User findUser(String userName) {
		TypedQuery<User> query = entityManager.createQuery("select u from User u where u.firstName=?1", User.class)
				.setParameter(1, userName);
		if (query != null)
			return query.getSingleResult();
		return null;
	}

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

	public void addMember(String memberId, String firstName, String lastName, String memberDOB, String phone,
			String memberEmail) {
		Member member = new Member();
		member.setMemberId(memberId);
		member.setFirstName(firstName);
		member.setLastName(lastName);
		member.setPhoneNumber(phone);
		member.setEmail(memberEmail);
		member.setDob(memberDOB);
		member.setJoinDate(LocalDate.now());
		entityTransaction.begin();
		entityManager.persist(member);
		entityTransaction.commit();
	}

}
