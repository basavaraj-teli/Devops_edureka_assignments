package music;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class hello {
	String message = "BrowserStack is the intended message";
	@Test 
	public void testMessage() {
	System.out. println("Inside testMessage()");
	assertEquals(message, "BrowserStack is the intended message");
}
	@Test 
	public void testMessage1() {
	System.out. println("Inside testMessage1()");
	assertEquals(message, "BrowserStack is the intended message");
	}
}
