package com.nit.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/welcome")
public class WelcomeResource {
	
	@GET
	public String getMsg()
	{
		
		String s=null;
				s.length();
		return "goodafternoon";
	}

}
