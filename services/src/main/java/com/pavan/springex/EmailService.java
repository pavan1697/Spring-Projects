package com.pavan.springex;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageSevice
{

	@Override
	public void message() {
		System.out.println("Check your Email for servies");
	}

}
