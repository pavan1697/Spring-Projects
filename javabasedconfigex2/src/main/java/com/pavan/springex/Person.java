package com.pavan.springex;

public class Person {
	private String name;
	private String email;
	
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
	
	public void personinfo()
	{
		System.out.println("hello "+name);
		System.out.println("your email is:"+email+" will get updates");
	}
}
