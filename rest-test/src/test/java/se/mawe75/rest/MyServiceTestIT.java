package se.mawe75.rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import org.junit.Test;

public class MyServiceTestIT {

	@Test
	public void test() {

		Client client = ClientBuilder.newClient();
		Response res = client.target("http://localhost:8181/rest/myservice").request("application/json").get();
		System.out.println("respone: " + res);
		
		
	}

}
