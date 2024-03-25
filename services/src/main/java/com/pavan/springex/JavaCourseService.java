package com.pavan.springex;

import org.springframework.stereotype.Component;

@Component
public class JavaCourseService implements CourseService
{

	@Override
	public void courseInfo() {
		System.out.println("Java FullStack Course contains core java,adv java,spring,springboot");
		
	}

}
