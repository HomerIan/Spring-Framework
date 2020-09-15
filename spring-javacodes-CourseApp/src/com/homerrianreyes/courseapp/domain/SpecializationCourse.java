package com.homerrianreyes.courseapp.domain;

public class SpecializationCourse implements Course {

	private final String COURSE_TYPE = "Major";
	private final String AVAILABILITY = "Physical and/or classroom setup";

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

		return AVAILABILITY;
	}

}
