package com.ltts.productionsproject.model;

public class Member {
	
	private String name;
	private String email;
	private String mobile;
	
	
	public Member() {
		super();
	}
	public Member(String name, String email, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}
	
	

}
