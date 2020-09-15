package com.homerrianreyes.courseapp.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Professor {
	
	@Autowired
	@Value("125")
	private Integer empNo;
	
	@Autowired
	@Value("Andrew Ng")
	private String name;
	
	@Autowired
	@Value("Artificial Intelligence")
	private String specialization;

	// Overload Constructor
	@Autowired
	public Professor(Integer empNo, String name, String specialization) {

		this.empNo = empNo;
		this.name = name;
		this.specialization = specialization;
	}

	// Default constructor
	public Professor() {

	}

	// Setter & Getter
	public Integer getEmpNo() {
		return empNo;
	}
	@Autowired
	public void setEmpNo(@Value("124")Integer empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}
	@Autowired
	public void setName(@Value("Friedrich Nietzsche")String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}
	@Autowired
	public void setSpecialization(@Value("Espitemology")String specialization) {
		this.specialization = specialization;
	}

	public String toString() {

		String output = "Professor: " + name + "\n" + "Professor Specialization: " + specialization + "\n";

		return output;
	}
}
