package se.mawe75.rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyServiceTestIT {
	private static final Logger LOGGER = LoggerFactory.getLogger(MyServiceTestIT.class);
	
	private static final String DEFAULT_URL = "http://localhost:8181";
	private static String TEST_SERVER_URL;

	@BeforeClass
	public static void init() {
		TEST_SERVER_URL = System.getProperty("test.url", DEFAULT_URL) + "/rest/myservice";
	}

	@Test
	public void test() {

		LOGGER.info("Test: {}", TEST_SERVER_URL);
		Client client = ClientBuilder.newClient();
		Response res = client.target(TEST_SERVER_URL).request("application/json").get();
		LOGGER.info("respone: {}", res);

	}

}
