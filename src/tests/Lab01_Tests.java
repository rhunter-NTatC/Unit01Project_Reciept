package tests;

import labs.*;

import java.io.InputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.*;


class Lab01_Tests {
	
	public String outputStream;
	private static final PrintStream systemOut = System.out;

	
	@Test
	@DisplayName("Test Problem #1")
	void test1() {
		outputStream = "";
		
		overridePrintStatements();
		
		Lab01.problem1();
		
		System.setOut(systemOut);
		
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
		
		overridePrintStatements();
		
		String testOutput = "";
		testOutput += "\\\\   //";
		testOutput += " \\\\ //";
		testOutput += "  \\\\/";
		testOutput += "  //\\";
		testOutput += " // \\\\";
		testOutput += "//   \\\\";
		
		
		
		Lab01.problem3();
		
		System.setOut(systemOut);
		
		
		
		try {
			Assertions.assertEquals(testOutput, outputStream);
		}
		catch (AssertionError e) {
			System.out.println("Error:\n"
					 + "Output not formatted correctly.");
			System.out.println("Output Stream = \n" + outputStream);
			Assertions.fail();
		}
	}
	
	
	@Test
	@DisplayName("Test Problem #4")
	void test4() {
		
		outputStream = "";
		
		overridePrintStatements();
		
		try {
			Lab01.problem4();
		}
		catch (Exception e) {
			System.setOut(systemOut);
			System.out.println("Error:\n"
					 + "Either problem 4 not started yet,"
					 + "or method not named correctly");
			Assertions.fail();
		}
		
		System.setOut(systemOut);
		
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
	
	
	@AfterAll
	static void afterAll() {
		System.setOut(systemOut);
	}
	
}
