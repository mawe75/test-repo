package se.mawe75.rest;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/myservice")
public class MyService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String message() {
		JsonObject object = Json.createObjectBuilder().add("name", "Kalle").add("age", 42).build();

		return object.toString();
	}

	@POST
	public String lowerCase(final String message) {
		if(message == null) {
			return "";
		}
		return message.toLowerCase();
		
	}
}
