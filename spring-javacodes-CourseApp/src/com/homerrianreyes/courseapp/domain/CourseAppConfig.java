package com.homerrianreyes.courseapp.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:courseinfo.properties")
public class CourseAppConfig {
	
	@Value("${courseinfo.code}")
	private String code;
	
	@Value("${courseinfo.description}")
	private String description;
	
	@Value("${courseinfo.unit}")
	private Integer unit;
	
	@Value("${professor.empNo}")
	private Integer empNo;
	
	@Value("${professor.name}")
	private String name;
	
	@Value("${professor.specialization}")
	private String specialization;
	
	@Bean
	public CourseInfo courseInfo() {
		
		return new CourseInfo();
	}
	
	@Bean
	public CourseInfo courseInfoConstructor() {

		/*String code = "ITL221";
		String description = "OOP Lab";
		Integer unit = 1;*/

		return new CourseInfo(code, description, unit, supportCourse(), professorConstructor());
	}
	@Bean
	public Professor professor() {

		return new Professor();
	}

	@Bean
	public Professor professorConstructor() {

		/*Integer empNo = 123;
		String name = "Albert Einstein";
		String specialization = "Data Mining";*/

		return new Professor(empNo, name, specialization);
	}

	@Bean
	public Course specializationCourse() {

		return new SpecializationCourse();
	}

	@Bean
	public Course supportCourse() {

		return new SupportCourse();
	}

}
