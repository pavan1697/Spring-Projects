package com.pavan.springex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Per")
public class JavaConfig {

	HomeLoanService homeLoanService;
	RealestateService realestateService;
	Person person;
	@Autowired
	public JavaConfig(HomeLoanService homeLoanService, RealestateService realestateService, Person person) {
		super();
		this.homeLoanService = homeLoanService;
		this.realestateService = realestateService;
		this.person = person;
	}
	
	
}
