package com.homerianreyes.courseapp.domain;

public class Professor {

	private Integer empNo;
	private String name;
	private String specialization;

	// constructor
	public Professor(Integer empNo, String name, String specialization) {
		this.empNo = empNo;
		this.name = name;
		this.specialization = specialization;
	}

	public Professor() {

	}

	// setter & getter
	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String toString() {

		String output = "Professor: " + name + "\n" + "Professor Specialization: " + specialization + "\n";

		return output;
	}
}
