package com.homerianreyes.courseapp.domain;

public class CourseInfo {

	private String code;
	private String description;
	private Integer unit;
	private Course course;
	private Professor professor;

	// constructor
	public CourseInfo(String code, String description, Integer unit, Course course, Professor professor) {

		this.code = code;
		this.description = description;
		this.unit = unit;
		this.course = course;
		this.professor = professor;
	}
	
	// setter & getter
	public CourseInfo() {

	}
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public Integer getUnit() {
		return unit;
	}

	public void setUnit(Integer unit) {
		this.unit = unit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Professor getProfessor() {
		return professor;
	}

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
