package Domain;

import java.util.ArrayList;

public class Student {
	
	private String studNo;
	private String name;
	private String program;
	private ArrayList<Course> courseList;

	
	public String getStudNo() {
		return studNo;
	}
	public void setStudNo(String studNo) {
		this.studNo = studNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public ArrayList<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	}
	public String toString() {
		
		String courseContent = new String();
		for(Course course:courseList) {
			courseContent +=course+"\n";
		}
		return "Student Number: "+studNo+"\n"+
				"Student Name: "+name+"\n"+
				"Program: "+program+"\n"+courseContent+"\n";
	}
	
}
