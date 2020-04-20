package com.homerreyes.schoolapp.domain;

public class SchoolRecord {
	public Integer id;
	public String name;
	public Person person;
	
	//constructor
	public SchoolRecord(Integer id, String name, Person person) {
	
		this.id = id;
		this.name = name;
		this.person = person;
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
