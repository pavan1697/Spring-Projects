package com.pavan.springex;

public class GreetingImpl implements Greeting
{

	@Override
	public void greet() {
		System.out.println("this is spring first project");
	}
	public GreetingImpl() {
		System.out.println("GreetingImple Constructor:Object created");
	}

}
