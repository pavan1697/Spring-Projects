package com.pavan.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Javaconfig {
	@Bean
	public Person person1()
	{
		Person p1=new Person();
		p1.setName("PavanKalyan");
		p1.setEmail("pavankalyan@jalapati.com");
		return p1;
	}
}
