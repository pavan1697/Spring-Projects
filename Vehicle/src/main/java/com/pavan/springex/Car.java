package com.pavan.springex;

public class Car implements vehicle
{
	private String model;
	private int max_speed;
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMax_speed() {
		return max_speed;
	}

	public void setMax_speed(int max_speed) {
		this.max_speed = max_speed;
	}

	@Override
	public void move() {
		System.out.println("You selected a vehicle:Car");
		System.out.println("Model of:"+model);
		System.out.println("With Max Speed of"+max_speed);
	}

}
