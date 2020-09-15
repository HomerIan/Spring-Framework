package com.homerreyes.schoolapp.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:record.properties")
public class SchoolAppConfig {
	
	@Value("${record.id}")
	private Integer id;
	
	@Value("${record.name}")
	private String name;
	
	//define a bean for SchoolRecord
	//method - bean name of SchoolRecord
	@Bean
	public SchoolRecord schoolRecord() {
		
		return new SchoolRecord();
	}
	//define a bean for SchoolRecord - constructor
	@Bean
	public SchoolRecord schoolRecordConstructor() {	
		//Integer id = 1234;
		//String name = "John";
		
		return new SchoolRecord(id, name, instructor());
	}
	
	//Define a bean for Student
	@Bean
	public Person student() {
		
		return new Student();
	}
	
	//Define a bean for Instructor
	@Bean
	public Person instructor() {
		
		return new Instructor();
	}
}
