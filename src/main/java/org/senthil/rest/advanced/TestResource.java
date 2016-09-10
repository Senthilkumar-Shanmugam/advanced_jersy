package org.senthil.rest.advanced;

import javax.ws.rs.Path;

@Path("test")
public class TestResource {

	public void sayHello(){
		System.out.println("hello");
	}
}
