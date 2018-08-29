package se.mawe75.rest;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyServiceTest {

	@Test
	public void testLowerCase() {

		MyService service = new MyService();
		String result = service.lowerCase("KALLE");
		
		assertEquals("kalle", result);
		
	}

}
