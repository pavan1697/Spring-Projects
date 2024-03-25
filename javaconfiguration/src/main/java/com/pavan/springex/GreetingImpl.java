package com.pavan.springex;

public class GreetingImpl implements Greeting
{

	@Override
	public void greet() {
		System.out.println("This is spring java based configuration");
	}
	public GreetingImpl() {
		System.out.println("this is constructor::object created");
	}
}
