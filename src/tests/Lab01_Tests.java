package tests;

import labs.*;
import java.io.PrintStream;
import org.junit.jupiter.api.*;


class Lab01_Tests {
	
	public String outputStream;
	
	
	@Test
	@DisplayName("Test Problem #1")
	void test1() {
		outputStream = "";
		
		Lab01.problem1();
		
		try {
			Assertions.assertEquals("Hello World", outputStream);
		}
		catch (AssertionError e) {
			System.out.println("Error:\n"
					 + "Output not formatted correctly.");
			Assertions.fail();
		}
		
	}
	
	
	@Test
	@DisplayName("Test Problem #2")
	void test2() {
		
		outputStream = "";
		
		System.out.println("No Test for Problem #2:");
		
		
	}
	
	
	@Test
	@DisplayName("Test Problem #3")
	void test3() {
		
		outputStream = "";
		
		String testOutput = "";
		testOutput += "\\\\   //\n";
		testOutput += " \\\\ //\n";
		testOutput += "  \\\\/\n";
		testOutput += "  //\\\n";
		testOutput += " // \\\\\n";
		testOutput += "//   \\\\\n";
		
		
		
		Lab01.problem3();
		
		try {
			Assertions.assertEquals(testOutput, outputStream);
		}
		catch (AssertionError e) {
			System.out.println("Error:\n"
					 + "Output not formatted correctly.");
			Assertions.fail();
		}
	}
	
	
	@Test
	@DisplayName("Test Problem #4")
	void test4() {
		
		outputStream = "";
		
		try {
			Lab01.problem4();
		}
		catch (Exception e) {
			System.out.println("Error:\n"
					 + "Either problem 4 not started yet,"
					 + "or method not named correctly");
			Assertions.fail();
		}
		
		try {
			Assertions.assertEquals("Comp Sci still looks like \"Magic\"", outputStream);
		}
		catch (AssertionError e) {
			System.out.println("Error:\n"
					 + "Output not formatted correctly.");
			Assertions.fail();
		}
		
	}
	
	
	/*
	 * Diverts all calls to println(), print() or printf() to printCalled()
	 */
	void overridePrintStatements() {
		System.setOut(new PrintStream(System.out) {
			
			public void print(String str) {
				printCalled(str);
			}
			
			
			public void println(String str) {
				printCalled(str);
			}
			
		});
		
	}
	
	
	/*
	 * Handles all print calls
	 */
	void printCalled(String str) {
		outputStream += str;
	}
	
	
}
