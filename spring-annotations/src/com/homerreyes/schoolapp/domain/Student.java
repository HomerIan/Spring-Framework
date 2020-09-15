package com.homerreyes.schoolapp.domain;

import org.springframework.stereotype.Component;
//Annotation
@Component
public class Student implements Person {

	static final String LABEL = "Student";
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
