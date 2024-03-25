package com.pavan.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//start the ioc container
       ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
    
       //get the bean object
       Student student=context.getBean("student",Student.class);
       student.details();
    }
}
