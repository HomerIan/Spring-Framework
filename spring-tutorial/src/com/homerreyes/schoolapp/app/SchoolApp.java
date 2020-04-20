package com.homerreyes.schoolapp.app;

import com.homerreyes.schoolapp.domain.*;


public class SchoolApp {

	
	public static void main(String[] args) {
		
		//create object of my choice
			Person person = new Student();
			
		//create school record object
			SchoolRecord record = new SchoolRecord(1234, "John", person);
			// or SchoolRecord record = new SchoolRecord(1234, "John", new Student/Instructor());
		
		/*put data in school record
			record.setId(1234);
			record.setName("John");
			record.setPerson(person);*/
			
		//print data in school record
			System.out.println(record);
	}

}

