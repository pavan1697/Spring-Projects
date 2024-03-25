package com.pavan.springex;

public class Traveller {
	private String name;
	private String email;
	private long mobile;
	vehicle vehicle;
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
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public void startJourney()
	{
		System.out.println("Hey "+name+" Welcome to Travel World");
		System.out.println("Check your Email "+email+" Mobile:"+mobile);
		vehicle.move();
	}
}
