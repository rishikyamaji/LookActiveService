package com.lookactive.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/v1")
public class LookActiveService {

	@GET
	@Path("/getTest")
	@Produces("text/html")
	public String getTest(){
		return "test";
	}
}
