package com.dhananjay.restjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/userinfo")
public class UserInfoResource {

	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public UserInfo getUserInfo(){
		
		System.out.println("Userifno is called");
		UserInfo userinfo = new UserInfo();
		userinfo.setAge(29);
		userinfo.setFirstname("dhananjay");
		userinfo.setLastname("Patankar");
		userinfo.setRole("Developer");
		return userinfo;

		
	}
	
	
	
}
