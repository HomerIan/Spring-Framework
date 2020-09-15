package TechServ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import Domain.Student;

public class StudentDA {
	private static ArrayList<Student> studentList;
	
	public StudentDA() throws FileNotFoundException {
		//read file 
		Scanner studentFile = new Scanner(new FileReader("../Aggregation-COMReport/src/Domain/studentInfo.csv"));
		
		studentList = new ArrayList<Student>();
		
		while(studentFile.hasNext()) {
			
			String rowStudent = new String();
			rowStudent = studentFile.nextLine();
			
			String[] rowStudentSpecific = new String[4];
			rowStudentSpecific = rowStudent.split(",");
			
			Student student = new Student();
			
			student.setStudNo(rowStudentSpecific[1].trim());
			student.setName(rowStudentSpecific[2].trim());
			student.setProgram(rowStudentSpecific[3].trim());
			
			//handle courseList
			CourseDA courseDA = new CourseDA(rowStudentSpecific[1]);
			student.setCourseList(CourseDA.getCourseList());
			
			studentList.add(student);
		}
	}
	public static ArrayList<Student> getStudentList(){
		return studentList;
	}
}
