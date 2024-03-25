package com.pavan.springex;

public class Pharmacy {
	private String name;
	private String location;
	
	
	public Pharmacy(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}


	public void pharmacyDetails()
	{
		System.out.println("You have selected "+name+" Pharmacy");
		System.out.println("It is located in "+location);
	}
}
