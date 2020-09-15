package com.homerianreyes.courseapp.domain;

public class SpecializationCourse implements Course {

	static final String COURSE_TYPE = "MAJOR";
	static final String COURSE_AVAILABILTY = "Physical and/or online classroom setup";

	@Override
	public String getCourseType() {

		return COURSE_TYPE;
	}

	@Override
	public String showUrgency() {

		return "Must follow prerequisites policy";
	}

	@Override
	public String displayAvailability() {

		return COURSE_AVAILABILTY;
	}

}
