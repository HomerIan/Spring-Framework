package Domain;

import java.util.ArrayList;

public class BlockSection {
	private String blockCode;
	private String description;
	private String adviser;
	private Integer totalStudents;
	private ArrayList<Student> studentList;
	
	public String getBlockCode() {
		return blockCode;
	}
	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAdviser() {
		return adviser;
	}
	public void setAdviser(String adviser) {
		this.adviser = adviser;
	}
	public Integer getTotalStudents() {
		return totalStudents;
	}
	public void setTotalStudents(Integer totalStudents) {
		this.totalStudents = totalStudents;
	}
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	public String toString() {
		
		String studentContent = new String();
		for (Student student : studentList) {
			studentContent += student + "\n";
		}

		return "Block Section: " + blockCode + "\n" + "Description: " + description + "\n" + "Adviser: " + adviser
				+ "\n\n" + "Total Students: " + totalStudents + "\n\n" + studentContent + "\n";
	}
}
