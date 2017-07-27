package com.dhananjay.restjersey;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserInfo {

	private String firstname;
	private String lastname;
	private int age;
	private String role;
	private int id;
	
	
	
	
//	public UserInfo(String firstname, String lastname, int age, String role) {
//		super();
//		this.firstname = firstname;
//		this.lastname = lastname;
//		this.age = age;
//		this.role = role;
//	}





	@Override
	public String toString() {
		return "UserInfo [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", role=" + role + "]";
	}





	public String getFirstname() {
		return firstname;
	}







	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}







	public String getLastname() {
		return lastname;
	}







	public void setLastname(String lastname) {
		this.lastname = lastname;
	}







	public int getAge() {
		return age;
	}







	public void setAge(int age) {
		this.age = age;
	}







	public String getRole() {
		return role;
	}







	public void setRole(String role) {
		this.role = role;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
	
	
}
