package com.homerreyes.schoolapp.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.homerreyes.schoolapp.domain.SchoolAppConfig;
import com.homerreyes.schoolapp.domain.SchoolRecord;

public class SchoolApp {

	public static void main(String[] args) {
		
		//We define the container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SchoolAppConfig.class);
		
		//We read the bean
		SchoolRecord record = context.getBean("schoolRecordConstructor",SchoolRecord.class);
		
		//Print School Record Object
		System.out.println(record);
		
		//Close the container
		context.close();
	}

}
