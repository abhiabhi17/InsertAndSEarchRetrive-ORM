package com.nit.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class TicketNotFoundExceptionMapper extends Exception implements ExceptionMapper <TicketNotFoundException> {





	public Response toResponse(TicketNotFoundException exception) {
		
		
		  ErrorResponse errRes=new ErrorResponse();
		  errRes.setStatusCode(Status.BAD_REQUEST);
		  errRes.setStatusMsg(exception.getMessage());
		  return Response.status(Status.BAD_REQUEST).entity(errRes).type("application/json").type("application/xml").build();
		 
		/*
		 * return
		 * Response.status(Status.BAD_REQUEST).entity(exception.getMessage()).build();
		 */
	}



}
