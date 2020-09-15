package com.homerianreyes.courseapp.domain;

public class SupportCourse implements Course {

	static final String COURSE_TYPE = "MINOR";
	static final String COURSE_AVAILABILTY = "Physical classroom setup";

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

		return COURSE_AVAILABILTY;
	}

}
