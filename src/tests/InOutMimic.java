package tests;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;

public class InOutMimic {

	private String outputStream = "";
	private final PrintStream systemOut;
	private final InputStream systemIn;
	private ByteArrayInputStream testIn;
	
	
	public InOutMimic() {
		String outputStream = "";
		systemOut = System.out;
		systemIn = System.in;
	}
	
	
	//HANDLING INPUT STREAM
	
	// this simulates the data as if it came from the system.in
	public void provideInput(String data) {
		testIn = new ByteArrayInputStream(data.getBytes());
		System.setIn(testIn);
	}
	
	
	
	
	
	//HANDLING OUTPUT STREAM
	
	//returns output stream
	public String getOutputStream() {
		return outputStream;
	}
	
	//set's output stream to empty string
	public void resetOutputStream() {
		outputStream = "";
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
				printCalled(str + "\n");
			}
			
		});
		
	}
	
	
	/*
	 * Handles all print calls
	 */
	public void printCalled(String str) {
		outputStream += str;
	}
	
	
	public void resetSystem() {
		System.setOut(systemOut);
		System.setIn(systemIn);
	}
	
	
	
	
	
	
}
