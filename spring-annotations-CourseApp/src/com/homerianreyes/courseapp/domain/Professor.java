package com.homerianreyes.courseapp.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//Annotation
@Component
@PropertySource("classpath:courseInfo.properties")
public class Professor {

	private Integer empNo;
	private String name;
	private String specialization;

	
	 //constructor
	 @Autowired 
	 public Professor(@Value("${Professor.empNo}") Integer empNo,
			 		  @Value("${Professor.name}") String name,
			 		  @Value("${Professor.specialization}") String specialization) {
	 
	 this.empNo = empNo; 
	 this.name = name; 
	 this.specialization = specialization; 
	 }

	// Default constructor
	public Professor() {

	}
	// setter & getter
	public Integer getEmpNo() {
		return empNo;
	}

	public String getName() {
		return name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public String toString() {

		String output = "Professor: " + name + "\n" + "Professor Specialization: " + specialization + "\n";

		return output;
	}
}
