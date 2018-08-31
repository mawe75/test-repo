package se.mawe75.rest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyServiceTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(MyServiceTest.class);
	
	@Test
	public void testLowerCase() {

		LOGGER.info("Running test testLowerCase");
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
