package Domain;

import java.util.ArrayList;

public class Student {
	private String studentNumber;
	private String name;
	private String program;
	private Integer totalUnitsEnrolled;
	private ArrayList<Course> courseList;

	public ArrayList<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
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

	public Integer getTotalUnitsEnrolled() {
		return totalUnitsEnrolled;
	}

	public void setTotalUnitsEnrolled(Integer totalUnitsEnrolled) {
		this.totalUnitsEnrolled = totalUnitsEnrolled;
	}

	public String toString() {
		String courseContent = new String();
		for (Course course : courseList) {
			courseContent += course + "\n";
		}

		return "Student Number: " + studentNumber + "\n" + "Student Name: " + name + "\n" + "Program: " + program + "\n"
				+ "Total Units Enrolled: " + totalUnitsEnrolled + "\n\n" + "Course Code" + "\t" + "Description" + "\t"
				+ "Units" + "\t" + "Day" + "\t" + "Time\t\n" + courseContent;
	}

}
