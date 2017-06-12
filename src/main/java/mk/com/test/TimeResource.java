package mk.com.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("time")
public class TimeResource {


	@GET
	public Response time() {
		return Response.ok("Time is: " + System.currentTimeMillis() + " Skopje server").build();
	}
}