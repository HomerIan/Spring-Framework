package com.homerreyes.schoolapp.domain;

public class Instructor implements Person {

	static final String LABEL = "Instructor";

	@Override
	public String getInitialThoughts() {

		return "Code like hell as if there is no tomorrow!";
	}

	@Override
	public String showFun() {

		return "I miss my bed. I just wanna rest!";
	}

	@Override
	public String getLabel() {

		return LABEL;
	}

}
