package com.homerianreyes.courseapp.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//Annotation
@Component
@PropertySource("classpath:courseInfo.properties")
public class CourseInfo {
	
	@Autowired
	@Value("SampleCode")
	private String code;
	
	@Autowired
	@Value("SampleDescription")
	private String description;
	private Integer unit;
	
	@Autowired
	@Qualifier("supportCourse")
	private Course course;
	
	@Autowired
	private Professor professor;

	
	  //Overload constructor
	  @Autowired 
	  public CourseInfo(@Value("${courseInfo.code}") String code,
			  			@Value("${courseInfo.description}") String description,
			  			@Value("${courseInfo.unit}") Integer unit,
			  			@Qualifier("specializationCourse") Course course,
			  			Professor professor) {
	 
	  this.code = code; 
	  this.description = description; 
	  this.unit = unit;
	  this.course = course; 
	  this.professor = professor; 
	  }
	 
	  
	//Default constructor
	public CourseInfo() {

	}
	// setter & getter
	public String getCode() {
		return code;
	}

	public Integer getUnit() {
		return unit;
	}

	public String getDescription() {
		return description;
	}

	public Course getCourse() {
		return course;
	}

	public Professor getProfessor() {
		return professor;
	}

	public String toString() {

		String result;

		result = "Course Code: " + code + "\n" + "Description: " + description + "\n" + "Unit: " + unit + "\n"
				+ "Course Type: " + course.getCourseType() + "\n" + "Policy on urgency: " + course.showUrgency() + "\n"
				+ "Availability: " + course.displayAvailability() + "\n" + professor;

		return result;
	}
}
