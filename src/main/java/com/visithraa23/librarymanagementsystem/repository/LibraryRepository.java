package com.visithraa23.librarymanagementsystem.repository;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import com.visithraa23.librarymanagementsystem.dto.Book;
import com.visithraa23.librarymanagementsystem.dto.IssueBook;
import com.visithraa23.librarymanagementsystem.dto.Member;
import com.visithraa23.librarymanagementsystem.dto.User;

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
		try {
			TypedQuery<User> query = entityManager.createQuery("select u from User u where u.firstName=?1", User.class)
					.setParameter(1, userName);
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}

	}

	public void addBook(String bookName, String author, String publisher, byte edition, byte quantity) {
		Book book = new Book();
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

	public void deleteBook(int bookId) {
		Book book = entityManager.find(Book.class, bookId);
		if (book != null) {
			entityTransaction.begin();
			book.setAvailableStatus("Inactive");
			entityManager.merge(book);
			entityTransaction.commit();
		} else {
			System.out.println("Book not found");
		}
	}

	public void deleteMember(int memberId) {
		Member member = (Member) entityManager.createQuery("select mem.* from Member mem where mem.memberId= ?1")
				.setParameter(1, memberId);
		if (member != null) {
			entityTransaction.begin();
			member.setMemberStatus("Inactive");
			entityManager.merge(member);
			entityTransaction.commit();
		} else {
			System.out.println("Member not found");
		}

	}

	public Member checkMemberPresent(String memberId) {
		try {
			TypedQuery<Member> member = entityManager
					.createQuery("select mem from Member mem where mem.memberId=?1", Member.class)
					.setParameter(1, memberId);
			return member.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

	public Book checkBookPresent(int bookId) {
		Book book = entityManager.find(Book.class, bookId);
		if (book == null) {
			return null;
		}
		return book;
	}

	public void issueBook(Member member, Book book) {
		IssueBook issue = new IssueBook();
		issue.setBook(book);
		issue.setMember(member);
		issue.setIssueStatus("Issued");
		issue.setIssueDate(LocalDate.now());
		entityTransaction.begin();
		entityManager.persist(issue);
		entityTransaction.commit();
	}

	public void returnBook(Member member, Book book) {
		entityTransaction.begin();
		entityManager.createQuery(
				"update IssueBook issue set issue.issueStatus=?1,issue.returnDate=?2 where issue.member=?3 AND issue.book=?4 AND issue.issueStatus=?5")
				.setParameter(1, "Returned").setParameter(2, LocalDate.now()).setParameter(3, member).setParameter(4, book).setParameter(5, "Issued").executeUpdate();
		entityTransaction.commit();
	}

}
