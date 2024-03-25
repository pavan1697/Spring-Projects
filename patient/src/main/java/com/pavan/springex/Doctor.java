package com.pavan.springex;

public class Doctor {
	private int id;
	private String name;
	
	public Doctor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void doctorDetails()
	{
		System.out.println("Doctor Id is:"+id);
		System.out.println("Doctor name is:"+name);
		
	}
}
