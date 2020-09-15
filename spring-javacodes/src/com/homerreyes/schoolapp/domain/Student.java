package com.homerreyes.schoolapp.domain;

public class Student implements Person {
	
	
	private final String LABEL = "Student";
	
	@Override
	public String getInitialThoughts() {
		
		return "Feel very excited to meet new friends!";
	}

	@Override
	public String showFun() {
		
		return "Playing arcade games in the mall!";
	}

	@Override
	public String getLabel() {
		
		return LABEL;
	}

}
