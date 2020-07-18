
//**********************************************************
//	Java				Author: Tracy
//						Date: July 14, 2020
//**********************************************************

import java.util.Random;

public class UserNames {
//This program displays first 4 characters of last name, first character of first name and a random number 10-99
	

	public static void main(String[] args) {
		
		String firstName = "John";
		String lastName = "DeLaSalle";
		
		int num;
		int min = 10;
		int max = 99;
		
		// Random number between 10-99 inclusive
		num = (int) ((Math.random() * (max - min + 1)) + min); // Random number between 10-99 inclusive
		
		char chFirst = firstName.charAt(0);  // first letter of first name
		String chLast = lastName.substring(0, 4);  // first four letters of last name
		
		System.out.println("Results: " + chLast + chFirst + num);
		
	}

}
