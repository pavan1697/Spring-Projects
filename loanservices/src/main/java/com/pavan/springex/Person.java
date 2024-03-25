package com.pavan.springex;

import org.springframework.stereotype.Component;

@Component
public class Person {
	
	HomeLoanService homeLoanService;
	RealestateService realestateService;
	public Person(HomeLoanService homeLoanService, RealestateService realestateService) {
		super();
		this.homeLoanService = homeLoanService;
		this.realestateService = realestateService;
	}
	
	public void loanservicedetails()
	{
		homeLoanService.loanInfo();
		realestateService.realestateInfo();
		
	}
}
