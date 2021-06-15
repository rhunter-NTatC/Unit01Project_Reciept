package tests;

import static org.junit.jupiter.api.Assertions.*;
import labs.*;
import org.junit.jupiter.api.*;


class Lab01_Tests {
	
	public static InOutMimic inOut;

	
	@BeforeAll
	static void beforeAll() {
		inOut = new InOutMimic();
	}
	
	@Test
	@DisplayName("Test Problem #1")
	void test1() {
		
		
		inOut.resetOutputStream();
		inOut.overridePrintStatements();
		Lab01.problem1();
		inOut.resetSystem();
		
		try {
			assertEquals("Hello World", inOut.getOutputStream());
		}
		catch (AssertionError e) {
			try {
				assertEquals("Hello World\n", inOut.getOutputStream());
			}
			catch (AssertionError g) {
				System.out.println("Error: "
						 + "Output not formatted correctly.");
				fail();
			}
		}
		
	}
	
	
	@Test
	@DisplayName("Test Problem #2")
	void test2() {
		
		
		
		System.out.println("No Test for Problem #2:");
		
		
	}
	
	
	@Test
	@DisplayName("Test Problem #3")
	void test3() {
		
		inOut.resetOutputStream();
		inOut.overridePrintStatements();
		Lab01.problem3();
		inOut.resetSystem();
		
		
		
		String testOutput = "";
		testOutput += "\\\\   //\n";
		testOutput += " \\\\ //\n";
		testOutput += "  \\\\/\n";
		testOutput += "  //\\\n";
		testOutput += " // \\\\\n";
		testOutput += "//   \\\\";
		
		try {
			assertEquals(testOutput, inOut.getOutputStream());
		}
		catch (AssertionError e) {
			try {
				assertEquals(testOutput + "\n", inOut.getOutputStream());
			}
			catch (AssertionError f) {
				System.out.println("Error: "
						 + "Output not formatted correctly.");
				System.out.println("Output Stream = \n" + inOut.getOutputStream());
				fail();
			}
		}
	}
	
	
	@Test
	@DisplayName("Test Problem #4")
	void test4() {
		
		inOut.resetOutputStream();
		inOut.overridePrintStatements();
		
		
		try {
			Lab01.problem4();
		}
		catch (Exception e) {
			inOut.resetSystem();
			System.out.println("Error: "
					 + "Either problem 4 not started yet,"
					 + " or method not named correctly");
			fail();
		}
		
		inOut.resetSystem();
		
		try {
			assertEquals("Comp Sci still looks like \"Magic\"", inOut.getOutputStream());
		}
		catch (AssertionError e) {
			try {
				assertEquals("Comp Sci still looks like \"Magic\"\n", inOut.getOutputStream());
			}
			catch (AssertionError f) {
				System.out.println("Error: "
						 + "Output not formatted correctly.");
				System.out.println("Output Stream = \n" + inOut.getOutputStream());
				fail();
			}
		}
		
	}
	
	
	
	@AfterAll
	static void afterAll() {
		inOut.resetSystem();
	}
	
}
