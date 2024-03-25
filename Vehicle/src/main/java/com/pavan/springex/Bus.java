package com.pavan.springex;

public class Bus implements vehicle
{
	private String busType;
	private int max_speed;
	
	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public int getMax_speed() {
		return max_speed;
	}

	public void setMax_speed(int max_speed) {
		this.max_speed = max_speed;
	}

	@Override
	public void move() {
		System.out.println("You selected a vehicle:Bus");
		System.out.println("Type of Bus:"+busType);
		System.out.println("With Max Speed of"+max_speed);
	}

}
