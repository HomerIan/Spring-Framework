package com.homerreyes.schoolapp.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class SchoolRecord {
	
	@Autowired
	@Value("1234")
	private Integer id;
	
	@Autowired
	@Value("John")
	private String name;
	
	@Autowired
	@Qualifier("instructor")
	private Person person;
	
	
	//Overload constructor
	@Autowired
	public SchoolRecord(Integer id, String name, Person person) {
		
		this.id = id;
		this.name = name;
		this.person = person;
	}
	//default constructor
	public SchoolRecord() {
		
	}
	//setter & getter
	public Integer getId() {
		return id;
	}
	@Autowired
	public void setId(@Value("1234")Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	@Autowired
	public void setName(@Value("John")String name) {
		this.name = name;
	}
	
	public Person getPerson() {
		return person;
	}
	@Autowired
	@Qualifier("instructor")
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
