package com.pavan.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
       
       Traveller t1= context.getBean("traveller",Traveller.class);
       t1.startJourney();
    }
}
