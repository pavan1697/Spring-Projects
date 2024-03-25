package com.pavan.springex;

public class Patient {
	private String name;
	private int age;
	Doctor doctor;
	Pharmacy pharmacy;
	public Patient(String name, int age, Doctor doctor, Pharmacy pharmacy) {
		super();
		this.name = name;
		this.age = age;
		this.doctor = doctor;
		this.pharmacy = pharmacy;
	}
	
	public void details()
	{
		System.out.println("Hey "+name+" Hope Your Health is Fine");
		System.out.println("Your Details as Per Our Records are Your Name is "+name+" Your Age is:"+age);
		doctor.doctorDetails();
		pharmacy.pharmacyDetails();
	}
}
