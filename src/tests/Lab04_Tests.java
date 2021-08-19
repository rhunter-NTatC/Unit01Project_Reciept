package tests;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Locale;

import org.junit.jupiter.api.*;
import labs.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Lab04_Tests {

	private String outputStream;
	private final PrintStream systemOut = System.out;
	private final InputStream systemIn = System.in;
	private ByteArrayInputStream testIn;
	private ByteArrayOutputStream newConsole;
	
	
	@Test
	@Order(1)
	@DisplayName("Test Problem #1")
	void test1() {
		
		overridePrintStatements();
		Lab04.problem1();
		resetSystem();
		
		
		String sample = "There are 65 bananas in this bunch.";
		outputStream = newConsole.toString();
		
		
		try {
			assertEquals(sample, outputStream);
		}
		catch (AssertionError e) {
			try {
				assertEquals(sample + "\n", outputStream);
			}
			catch (AssertionError f) {
				System.out.println("Error: "
						 + "Output not formatted correctly.");
				System.out.println("Output Stream = \n" + outputStream);
				fail();
			}
		}
		
		
	}
	
	@Test
	@Order(2)
	@DisplayName("Test Problem #2")
	void test2() {
		
		overridePrintStatements();
		Lab04.problem2();
		resetSystem();
		
		
		String sample = "The bananas cost us $8.72 total.\n";
		sample += "The apples cost us $14.98 total.";
		outputStream = newConsole.toString();
		
		try {
			assertEquals(sample, outputStream);
		}
		catch (AssertionError e) {
			try {
				assertEquals(sample + "\n", outputStream);
			}
			catch (AssertionError f) {
				System.out.println("Error: "
						 + "Output not formatted correctly.");
				System.out.println("Output Stream = \n" + outputStream);
				fail();
			}
		}
		
		
	}
	
	@Test
	@Order(3)
	@DisplayName("Test Problem #3")
	void test3() {
		
		overridePrintStatements();
		Lab04.problem3();
		resetSystem();
		
		
		String sample = "Did you know 7.488% of all statistics are made up on the spot?";
		outputStream = newConsole.toString();
		
		try {
			assertEquals(sample, outputStream);
		}
		catch (AssertionError e) {
			try {
				assertEquals(sample + "\n", outputStream);
			}
			catch (AssertionError f) {
				System.out.println("Error: "
						 + "Output not formatted correctly.");
				System.out.println("Output Stream = \n" + outputStream);
				fail();
			}
		}
		
	}
	
	@Test
	@Order(4)
	@DisplayName("Test Problem #4")
	void test4() {
		
		overridePrintStatements();
		Lab04.problem4();
		resetSystem();
		
		
		String sample = "On average, it is 92,955,807 miles to the sun.";
		outputStream = newConsole.toString();
		
		try {
			assertEquals(sample, outputStream);
		}
		catch (AssertionError e) {
			try {
				assertEquals(sample + "\n", outputStream);
			}
			catch (AssertionError f) {
				System.out.println("Error: "
						 + "Output not formatted correctly.");
				System.out.println("Output Stream = \n" + outputStream);
				fail();
			}
		}
		
		
	}
	
	@Test
	@Order(5)
	@DisplayName("Test Problem #5")
	void test5() {
		
		overridePrintStatements();
		
		//make sure problem5() exists
		try {
			Lab04.problem5();
		}
		catch (Exception e){
			resetSystem();
			System.out.println("Error: "
					 + "Either problem 5 not started yet,"
					 + " or method not named correctly");
			fail();
		}
		
		resetSystem();
		
		
		String sample = "apples    =   4.36\n";
		sample += "bananas   =  14.98";
		outputStream = newConsole.toString();
		
		try {
			assertEquals(sample, outputStream);
		}
		catch (AssertionError e) {
			try {
				assertEquals(sample + "\n", outputStream);
			}
			catch (AssertionError f) {
				System.out.println("Error: "
						 + "Output not formatted correctly.");
				System.out.println("Output Stream = \n" + outputStream);
				fail();
			}
		}
		
	}

	
	
	
	
	
	/*
	 * Diverts all calls to println(), print() or printf() to printCalled()
	 */
	void overridePrintStatements() {
		
		newConsole = new ByteArrayOutputStream();
				
		System.setOut(new PrintStream(newConsole) {
			
			
		});
		
	}
	

	
	
	void resetSystem() {
		System.setOut(systemOut);
		System.setIn(systemIn);
	}
	
	
	
}
