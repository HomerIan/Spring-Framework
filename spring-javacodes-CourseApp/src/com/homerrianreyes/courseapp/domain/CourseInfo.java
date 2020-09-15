package com.homerrianreyes.courseapp.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class CourseInfo {
	
	@Autowired
	@Value("CIS114-18")
	private String code;
	
	@Autowired
	@Value("Organization and Management Concept ")
	private String description;
	
	@Autowired
	@Value("3")
	private Integer unit;
	
	@Autowired
	@Qualifier("SpecializationCourse")
	private Course course;
	
	@Autowired
	private Professor professor;

	// Default Constructor
	public CourseInfo() {

	}

	// Overload Constructor
	@Autowired
	public CourseInfo(String code, String description, Integer unit, Course course, Professor professor) {

		this.code = code;
		this.description = description;
		this.unit = unit;
		this.course = course;
		this.professor = professor;
	}

	// Setter & Getter Method
	public String getCode() {
		return code;
	}
	@Autowired
	public void setCode(@Value("PHILO1")String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}
	@Autowired
	public void setDescription(@Value("Philosophy in times of Crises")String description) {
		this.description = description;
	}

	public Integer getUnit() {
		return unit;
	}
	@Autowired
	public void setUnit(@Value("3")Integer unit) {
		this.unit = unit;
	}

	public Course getCourse() {
		return course;
	}
	@Autowired
	public void setCourse(@Qualifier("SupportCourse")Course course) {
		this.course = course;
	}

	public Professor getProfessor() {
		return professor;
	}
	@Autowired
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String toString() {

		String result;

		result = "Course Code: " + code + "\n" + "Description: " + description + "\n" + "Unit: " + unit + "\n"
				+ "Course Type: " + course.getCourseType() + "\n" + "Policy on urgency: " + course.showUrgency() + "\n"
				+ "Availability: " + course.displayAvailability() + "\n" + professor;

		return result;
	}

}
