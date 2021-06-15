package labs;

import java.util.Scanner; //necessary for problem #2

/*
 * Lab02 - Strings & Scanners
 * 
 * Name: 
 * 
 * Is this lab you'll be practicing with declaring and using String variables.
 * This includes declaration, initialization and concatenation.
 * 
 * You'll also be using a Scanner object to get input from the keyboard
 */

public class Lab02 {
	
	public static void main(String[] args) {
		
		problem1();
		problem2();
		problem3();
		problem4();

	}
	
	
	//Problem #1
	public static void problem1() {
		String nameFirst;
		nameFirst = "George";
		String nameLast = "Orwell";
		System.out.println(nameFirst + " " + nameLast + " wrote the book \"Animal Farm\"");
	}
	
	
	//Problem #2
	public static void problem2() {
		String stringVariable = "A String Variable is the containter that holds a String Literal.";
		String stringLiteral = "A String Lieteral is the actual text that is either stored or printed.";
		System.out.println(stringVariable);
		System.out.println(stringLiteral);
	}


	//Problem #3
	public static void problem3() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("What city are you from? ");
		String input = inKey.nextLine();
		
		System.out.println("I hear " + input + " is a fun city.");
	}
	
	
	//Problem #4
	public static void problem4() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("What typye of flower do you like? ");
		String input = inKey.nextLine();
		
		System.out.println(input + "s make a beautiful boquet!");
	}
	
}
