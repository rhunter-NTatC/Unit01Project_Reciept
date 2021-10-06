package labs;

import java.util.Scanner; //necessary for problem #2

/*
 * Lab02 - Strings & Scanners
 * 
 * Name: 
 * 
 * In this lab you'll be practicing with declaring and using String variables.
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
		

		
	}
	
	
	//Problem #2
	public static void problem2() {
		

		
	}


	//Problem #3
	public static void problem3() {
//		Scanner inKey = new Scanner(System.in); //See SCANNER OBJECTS below for explanation
//		System.out.print();
//		String input = inKey.nextLine();

		
	}
	
	
	//Problem #4
	public static void problem4() {
//		Scanner inKey = new Scanner(System.in);
//		System.out.print();
//		String input = inKey.nextLine();
		
		
	}
	
	
	
	
	
}

/*
 * SCANNER OBJECTS
 * 
 * Scanners allow your code to get input from the computer.
 * We're scanning from the keyboard now, but we can scan from 
 * files and other places as well.
 * 
 * 2 things are necessary to set up scanning from the keyboard
 *   
 *   1: at the VERY top you'll find
 *      import java.util.Scanner;
 *      This is a library import.  It's like giving you code
 *      the vocabulary it needs to understand code.
 *   
 *   2: Create a Scanner object
 *   	Scanner inKyey = new Scanner(System.in);
 *   	
 *   	You only need to do this ONCE!
 *   	
 *   	Here are the parts.
 *   
 *   	Scanner inKey 
 *         Declaring a Scanner called inKey
 *         Just like declaring an Integer called 
 *            triangleArea (int triangle Area)
 *         Scanner is the type
 *         inKey is the name (can be whatever you want)
 *      
 *      new Scanner()
 *         Tells Java to create a Scanner object
 *         
 *      System.in   
 *         Tells Java that it's scanning from the keyboard
 *         
 *    SUMMARY     
 *       import java.util.Scanner;  (at the top)
 *       Scanner inKey = new Scanner(System.in);  (create the Scanner)
 * 
 * 
 * Now you're ready to scan.
 * 
 * 
 * Here are a few Scanner methods.
 *    Once you've created the Scanner, you can use these 
 *    as much as necessary.
 * 
 *    For Strings
 *       nextLint() = scans everything as a String until the end of a line
 *       next() = scans everything as String until a space
 * 
 *    For numbers
 *       nextInt() = scans integers (until a space or return)
 *       	fails if it's text or a decimal
 *       nextDouble() = scans numbers as a decimal  (until a space or return)
 *          fails if it's text
 * 
 * 
 */
