package com.visithraa23.librarymanagementsystem.util;

import java.time.LocalDate;

public class Util {

	public static boolean isValidName(String name) {
		return name.matches("^[a-zA-Z]+( [a-zA-Z]+)*$");
	}

	public static boolean isValidPhoneNumber(String phoneNumber) {
		return phoneNumber.matches("^\\d{10}$");
	}

	public static boolean isValidDateOfBirth(String dob) {
		try {
			LocalDate date = LocalDate.parse(dob);
			return date.isBefore(LocalDate.now());
		} catch (Exception e) {
			return false;
		}
	}
	public static boolean isValidEmail(String email) {
	    return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
	}

}
