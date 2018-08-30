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

	@Test
	public void testLowerCaseNull() {

		MyService service = new MyService();
		String result = service.lowerCase(null);
		
		assertNotNull(result);
		assertTrue(result.isEmpty());
		
	}

	
	@Test
	public void testMessage() {

		MyService service = new MyService();
		String result = service.message();
		
		assertNotNull(result);
		assertFalse(result.isEmpty());
		
	}

	
}
