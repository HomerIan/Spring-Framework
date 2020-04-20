package com.homerianreyes.courseapp.app;

import com.homerianreyes.courseapp.domain.*;

public class CourseApp {

	public static void main(String[] args) {

		// create object of my choice
		Course course = new SupportCourse();
		// create course record object
		Professor prof = new Professor();
		// put data in course record
		prof.setEmpNo(124);
		prof.setName("Friedrich Nietzsche");
		prof.setSpecialization(" Epistemology");
		
		CourseInfo info = new CourseInfo();
		// put data in course record
		info.setCode("PHILO1");
		info.setDescription("Philosophy in times of Crises");
		info.setUnit(3);
		info.setCourse(course);
		info.setProfessor(prof);
		// print data in course record
		System.out.println(info);
		
		}

}
