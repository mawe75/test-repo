package se.mawe75.rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import org.junit.BeforeClass;
import org.junit.Test;

public class MyServiceTestIT {

	private static final String DEFAULT_URL = "http://localhost:8181";
	private String urlTest;

	@BeforeClass
	public void init() {
		urlTest = System.getProperty("test.url", DEFAULT_URL) + "/rest/myservice";
	}

	@Test
	public void test() {

		Client client = ClientBuilder.newClient();
		Response res = client.target(urlTest).request("application/json").get();
		System.out.println("respone: " + res);

	}

}
