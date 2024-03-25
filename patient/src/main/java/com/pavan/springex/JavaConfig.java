package com.pavan.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig 
{
	@Bean
	public Doctor doctor()
	{
		Doctor doctor=new Doctor(1697, "Pavan Kalyan");
		return doctor;	
	}
	
	@Bean
	public Pharmacy pharmacy()
	{
		Pharmacy pharmacy=new Pharmacy("Apollo Medicals", "Ongole");
		return pharmacy;
	}
	
	@Bean
	public Patient patient1()
	{
		Patient patient= new Patient("Ravi", 26, doctor(), pharmacy());
		return patient;
	}
}
