package com.homerreyes.schoolapp.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.homerreyes.schoolapp.domain.*;


public class SchoolApp {

	
	public static void main(String[] args) {
		
		//Open container by config file
		
		//Application context where the container is handled/managed
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		// Read bean
		SchoolRecord record = context.getBean("schoolRecord",SchoolRecord.class);
		//SchoolRecord record = context.getBean("recordConstructor",SchoolRecord.class);
		//Print school record
		System.out.println(record);
		//close context
		context.close();
	}

}

