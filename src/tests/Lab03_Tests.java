package tests;

import static org.junit.jupiter.api.Assertions.*;

import labs.*;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Lab03_Tests {

	
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
		Lab03.problem1();
		inOut.resetSystem();
		
		String sample = "There are 82 students in 1st-4th periods.";
		
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
				System.out.println("Output Stream = \n" + inOut.getOutputStream());
				fail();
			}
		}
		
	}
	
	
	@Test
	@Order(2)
	@DisplayName("Test Problem #2a")
	void test2a() {
		
		inOut.resetOutputStream();
		inOut.overridePrintStatements();
		inOut.provideInput("3 7");
		Lab03.problem2();
		inOut.resetSystem();
		
		String sample = "A triangle with a base of 3 and height of 7 has an area of 10.5.";
        
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
	@Order(3)
	@DisplayName("Test Problem #2b")
	void test2b() {
		
		inOut.resetOutputStream();
		inOut.overridePrintStatements();
		inOut.provideInput("11 5");
		Lab03.problem2();
		inOut.resetSystem();
		
		String sample = "A triangle with a base of 11 and height of 5 has an area of 27.5.";
		

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
	@DisplayName("Test Problem #3a")
	void test3a() {
		inOut.resetOutputStream();
		inOut.overridePrintStatements();
		inOut.provideInput("4 15");
		Lab03.problem3();
		inOut.resetSystem();
		
		String sample = "If we split 15 sticks of gum evenly between 4 "
				+ "people, there would be 3 stick(s) left over.";
		
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
	@DisplayName("Test Problem #3b")
	void test3b() {
		inOut.resetOutputStream();
		inOut.overridePrintStatements();
		inOut.provideInput("3 12");
		Lab03.problem3();
		inOut.resetSystem();
		
		String sample = "If we split 12 sticks of gum evenly between 3 "
				+ "people, there would be 0 stick(s) left over.";

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
