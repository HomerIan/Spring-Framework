package com.homerianreyes.courseapp.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.homerianreyes.courseapp.domain.*;

public class CourseApp {

	public static void main(String[] args) {

		// Open container by config file
		// Application context where the container is handled/managed
		ClassPathXmlApplicationContext contextfile = new ClassPathXmlApplicationContext("contextfile.xml");
		// Read bean
		CourseInfo info = contextfile.getBean("courseInfo", CourseInfo.class);
		// Print Course Record
		System.out.println(info);
		// close context
		contextfile.close();
	}

}
