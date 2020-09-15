package com.homerreyes.schoolapp.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
//Annotation
@Component
@PropertySource("classpath:record.properties")
public class SchoolRecord {
	//Annotation
	@Autowired
	@Value("123")
	public Integer id;
	
	@Autowired
	@Value("John")
	public String name;
	
	@Autowired
	@Qualifier("instructor")
	public Person person;
	
	//Overload constructor
	@Autowired
	public SchoolRecord(@Value("${record.id}")Integer id,
						@Value("${record.name}") String name,
						@Qualifier("student") Person person) {
	
		this.id = id;
		this.name = name;
		this.person = person;
	}
	//Default constructor
	public SchoolRecord() {
		
	}
	//setter & getter methods
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public String toString() {
		String output;
		
		output = person.getLabel() + " number: " + getId() +"\n" +
				 person.getLabel() + " name: " + getName() + "\n" +
				 "Initial Thoughts: "+ person.getInitialThoughts() +"\n" +
				 "Idea of fun: "+ person.showFun();
		return output;
	}
	
}