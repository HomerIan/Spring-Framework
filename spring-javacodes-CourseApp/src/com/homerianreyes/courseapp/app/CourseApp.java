package com.homerianreyes.courseapp.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.homerrianreyes.courseapp.domain.CourseAppConfig;
import com.homerrianreyes.courseapp.domain.CourseInfo;

public class CourseApp {

	public static void main(String[] args) {

		// We define the container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CourseAppConfig.class);

		// We read the bean
		CourseInfo info = context.getBean("courseInfoConstructor", CourseInfo.class);

		// Print School Record Object
		System.out.println(info);

		// close the container
		context.close();
	}
}
