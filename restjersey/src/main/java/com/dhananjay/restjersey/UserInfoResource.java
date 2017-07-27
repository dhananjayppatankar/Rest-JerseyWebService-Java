package com.dhananjay.restjersey;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/userinfo")
public class UserInfoResource {

	UserInfoRepository repo =new UserInfoRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public List<UserInfo> getUserInfo() {

		System.out.println("All Userifno is called");
		
		return repo.getUserInfos();
	}

		
	@POST
	@Path("/newuser")
	public UserInfo postUserInfo(UserInfo userinfo){
		
		System.out.println("Post is called");
		repo.createUserRepo(userinfo);
		return userinfo;
		
		
	}

}

