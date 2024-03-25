package com.pavan.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Javaconfig {
	@Bean
	public GreetingImpl greet()
	{
		GreetingImpl greet=new GreetingImpl();
		return greet;
	}
}
