package TechServ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import Domain.Student;

public class StudentDA {
	
	static ArrayList<Student> studentList;
	static Integer totalNumberOfStudents;
	public StudentDA(String courseCode) throws FileNotFoundException {
		
		Scanner studentFile = new Scanner(new FileReader("../Aggregation-COMReportVer.2/src/Domain/studentInfo.csv"));
		
		studentList = new ArrayList<Student>();
		totalNumberOfStudents = 0;
		while(studentFile.hasNext()) {
			
			String rowStudent = new String();
			rowStudent = studentFile.nextLine();
			
			String[] rowStudentSpecific = new String[4];
			rowStudentSpecific = rowStudent.split(",");
			
			if(courseCode.equals(rowStudentSpecific[0].trim())) {
				
				Student student = new Student();
				
				student.setStudentNumber(rowStudentSpecific[1].trim());
				student.setName(rowStudentSpecific[2].trim());
				student.setProgram(rowStudentSpecific[3].trim());
				
				CourseDA courseDA = new CourseDA(rowStudentSpecific[1].trim());
				student.setCourseList(CourseDA.getcourseList());
				student.setTotalUnitsEnrolled(CourseDA.getTotalUnits());
				
				studentList.add(student);
				totalNumberOfStudents++;
			}
			
		}	
	}
	
	public static Integer getTotalNumberOfStudent() {
		return totalNumberOfStudents;
	}

	public static ArrayList<Student> getStudentList() {
		return studentList;
	}
}
