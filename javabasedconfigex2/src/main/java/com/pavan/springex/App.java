package com.pavan.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(Javaconfig.class);
        
        Person p1= context.getBean("person1",Person.class);
        p1.personinfo();
    }
}
