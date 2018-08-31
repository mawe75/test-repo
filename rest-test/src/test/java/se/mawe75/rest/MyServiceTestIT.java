package se.mawe75.rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import org.junit.BeforeClass;
import org.junit.Test;

public class MyServiceTestIT {
	
	private static final String DEFAULT_URL = "http://localhost:8181";
	private static String TEST_SERVER_URL;

	@BeforeClass
	public static void init() {
		TEST_SERVER_URL = System.getProperty("test.url", DEFAULT_URL) + "/rest/myservice";
	}

	@Test
	public void test() {

		System.out.println("Test: " + TEST_SERVER_URL);
		Client client = ClientBuilder.newClient();
		Response res = client.target(TEST_SERVER_URL).request("application/json").get();
		System.out.println("respone: " + res);

	}

}
