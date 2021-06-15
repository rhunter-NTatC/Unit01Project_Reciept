package tests;

import static org.junit.jupiter.api.Assertions.*;

import labs.*;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Lab02_Tests {


	public static InOutMimic inOut;

	
	@BeforeAll
	static void beforeAll() {
		//create Standard.in and out mimic
		inOut = new InOutMimic();
	}
	
	
	
	@Test
	@Order(1)
	@DisplayName("Test Problem #1")
	void test1() {
		
		inOut.resetOutputStream();
		inOut.overridePrintStatements();
		Lab02.problem1();
		inOut.resetSystem();
		
		String sample = "George Orwell wrote the book \"Animal Farm\"";
		
		try {
			assertEquals(sample, inOut.getOutputStream());
		}
		catch (AssertionError e) {
			try {
				assertEquals(sample + "\n", inOut.getOutputStream());
			}
			catch (AssertionError f) {
				System.out.println("Error: "
						 + "Output not formatted correctly.");
				fail();
			}
		}
		
	}

	
	@Test
	@Order(2)
	@DisplayName("Test Problem #2")
	void test2() {
		
		System.out.println("No Test for Problem #2");
		
	}
	
	
	@Test
	@Order(3)
	@DisplayName("Test Problem #3a")
	void test3a() {
		
		inOut.resetOutputStream();
		inOut.overridePrintStatements();
		inOut.provideInput("Toronto");
		Lab02.problem3();
		inOut.resetSystem();
		
		String sample = "I hear Toronto is a fun city.";
		
		try {
			assertTrue(inOut.getOutputStream().contains(sample));
		}
		catch (AssertionError e) {
			System.out.println("Error: "
					 + "Output not formatted correctly.");
			System.out.println("Output Stream = \n" + inOut.getOutputStream());
			fail();
		}
		
		
		
	}
	
	
	@Test
	@Order(4)
	@DisplayName("Test Problem #3b")
	void test3b() {
		
		inOut.resetOutputStream();
		inOut.overridePrintStatements();
		inOut.provideInput("Singapore");
		Lab02.problem3();
		inOut.resetSystem();
		
		String sample = "I hear Singapore is a fun city.";
		
		try {
			assertTrue(inOut.getOutputStream().contains(sample));
		}
		catch (AssertionError e) {
			System.out.println("Error: "
					 + "Output not formatted correctly.");
			System.out.println("Output Stream = \n" + inOut.getOutputStream());
			fail();
		}
		
		
		
	}
	
	
	@Test
	@Order(5)
	@DisplayName("Test Problem #4a")
	void test4a() {
		
		inOut.resetOutputStream();
		inOut.overridePrintStatements();
		inOut.provideInput("Rose");
		
		//make sure problem4() exists
		try {
			Lab02.problem4();
		}
		catch (Exception e) {
			inOut.resetSystem();
			System.out.println("Error: "
					 + "Either problem 4 not started yet,"
					 + " or method not named correctly");
			fail();
		}
		
		
		inOut.resetSystem();
		
		String sample = "Roses make a beautiful boquet!";
		
		try {
			assertTrue(inOut.getOutputStream().contains(sample));
		}
		catch (AssertionError e) {
			System.out.println("Error: "
					 + "Output not formatted correctly.");
			System.out.println("Output Stream = \n" + inOut.getOutputStream());
			fail();
		}
		
		
		
	}
	
	
	@Test
	@Order(6)
	@DisplayName("Test Problem #4a")
	void test4b() {
		
		inOut.resetOutputStream();
		inOut.overridePrintStatements();
		inOut.provideInput("Tulip");
		
		//make sure problem4() exists
		try {
			Lab02.problem4();
		}
		catch (Exception e) {
			inOut.resetSystem();
			System.out.println("Error: "
					 + "Either problem 4 not started yet,"
					 + " or method not named correctly");
			fail();
		}
		
		inOut.resetSystem();
		
		String sample = "Tulips make a beautiful boquet!";
		
		try {
			assertTrue(inOut.getOutputStream().contains(sample));
		}
		catch (AssertionError e) {
			System.out.println("Error: "
					 + "Output not formatted correctly.");
			System.out.println("Output Stream = \n" + inOut.getOutputStream());
			fail();
		}
		
		
		
	}
	
	
	
	
	@AfterAll
	static void afterAll() {
		//Put all input and output back to normal
		inOut.resetSystem();
	}
}
