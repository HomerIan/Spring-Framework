package com.homerrianreyes.courseapp.domain;

public class SupportCourse implements Course {

	private final String COURSE_TYPE = "Minor";
	private final String AVAILABILITY = "Physical classroom setup only";

	@Override
	public String getCourseType() {

		return COURSE_TYPE;
	}

	@Override
	public String showUrgency() {

		return "Can be taken during any semester period in pursuing degree program";
	}

	@Override
	public String displayAvailability() {

		return AVAILABILITY;
	}

}
