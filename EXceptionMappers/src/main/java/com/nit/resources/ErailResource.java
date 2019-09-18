package com.nit.resources;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.nit.exception.TicketNotFoundException;
import com.nit.exception.TicketNotFoundExceptionMapper;
import com.nit.pojo.Ticket;

@Path("/erail")
public class ErailResource {
	
	@GET
	@Path("/{pnr}")
	public Response getStatus(@PathParam("pnr") String pnr) throws  Exception
	
	{
		Response res=null;
		if("ABC123".equals(pnr))
		{
			
		
		Ticket t=new Ticket();
		t.setTicketId(100);
		t.setPnr("ABC123");
		t.setStatus("Booked");
		return Response.ok(t).build();
		
       	}
		
		else
		{
			
			throw  new TicketNotFoundException("TicketNot Found");
		
		}
			
	
	}

	}
