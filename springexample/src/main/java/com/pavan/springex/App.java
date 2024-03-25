package com.pavan.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       //start the container
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
    	
    	//get the object from container to call your methods
    	GreetingImpl greet=context.getBean("greet",GreetingImpl.class);
    	
    	greet.greet();
    }
}
