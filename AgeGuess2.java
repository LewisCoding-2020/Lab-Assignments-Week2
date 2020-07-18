//**********************************************************
//	Java				Author: Trac
//						Date: July 16, 2020
//**********************************************************

import java.util.Scanner;
import java.util.Random;

public class AgeGuess2 {
///This program prompts user to guess the age and saves to ageGuess variable
// Then displays the users guess and actual age

	public static void main(String[] args) {
		
		String name;
		int ageGuess;
		int age;
		
		Scanner scan = new Scanner(System.in);
		Random gen = new Random();
		age = gen.nextInt(100) + 1;  //generates random from 0-100
		
		System.out.print("Enter your name: ");
		name = scan.nextLine();
		
		System.out.print("Guess the age of " + name + ": ");
		ageGuess = scan.nextInt();
		
		System.out.print("Nice guess, " + name + "'s" + " actual age is: " + age);
		
		scan.close();
		

	}

}
