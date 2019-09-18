package com.nit.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.nit.exception.TicketNotFoundException;
import com.nit.exception.TicketNotFoundExceptionMapper;
import com.nit.resources.ErailResource;
import com.nit.resources.WelcomeResource;

@ApplicationPath("/app/*")
public class MyApp extends Application{
	

	@Override
	public Set<Object> getSingletons() {
		
		Set<Object> objs= new HashSet<Object>();
		objs.add(new WelcomeResource());
		objs.add(new ErailResource());
		return objs;
	}
	@Override
	public Set<Class<?>> getClasses() {
	
		 Set<Class<?>> classes=new HashSet<Class<?>>();
		 classes.add(TicketNotFoundExceptionMapper.class);
		
		return classes;
	}
	


}
