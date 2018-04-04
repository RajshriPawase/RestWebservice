package com.scp.RestProduces;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/adhar")
public class AdharControllers {
	AdharService as = new AdharService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<AdharDetails> getAllAdharDetails() {
		List<AdharDetails> listOfUsers = as.getAdharDetails();
		return listOfUsers;
	}
	@GET
	@Path("/get")
	@Produces(MediaType.TEXT_HTML)
	public String sayHello(){
		System.out.println("Helloo");
		return "WELCOME";
	}
	@POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	public AdharDetails addAdharDetails(AdharDetails ad) {
		System.out.println("added");
		return as.addAdDetails(ad);
	}

}
