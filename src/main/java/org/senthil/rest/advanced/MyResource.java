package org.senthil.rest.advanced;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Singleton
@Path("test")
public class MyResource {
	 private int count;
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod(){
		count ++;
		return "it works is called >>"+count+" times";
	}
}
