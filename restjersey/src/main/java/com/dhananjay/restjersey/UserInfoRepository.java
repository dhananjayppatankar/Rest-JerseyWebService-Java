package com.dhananjay.restjersey;

import java.util.ArrayList;
import java.util.List;

public class UserInfoRepository {
	
	List<UserInfo> list;

	public UserInfoRepository() {
		super();
		list = new ArrayList<UserInfo>();

		UserInfo dhan = new UserInfo();
		dhan.setId(1);
		dhan.setAge(29);
		dhan.setFirstname("dhananjay");
		dhan.setLastname("Patankar");
		dhan.setRole("Developer");
			
		UserInfo dheer = new UserInfo();
		dheer.setId(2);
		dheer.setAge(28);
		dheer.setFirstname("dheer");
		dheer.setLastname("Patankar");
		dheer.setRole("dev");
		list.add(dhan);
		list.add(dheer);
		
	}
	
	public List<UserInfo> getUserInfos(){
		
		return this.list;
		
	}
	
	public UserInfo getUserInfo(int id){
		
		for(UserInfo user : list ){
			if(user.getId()==id)
				return user;
			
		}
		return null;
		
	}
	
	public void createUserRepo(UserInfo userinfo){
		
		list.add(userinfo);
		
	}
	
	

}
