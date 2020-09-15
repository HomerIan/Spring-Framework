package TechServ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import Domain.Student;

public class StudentDA {
	//constructor
	public StudentDA() throws FileNotFoundException {
		Scanner studentFile = new Scanner(new FileReader("../OOP/src/Domain/studentInfo.csv"));
		
		//create Array list for student Data
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		//put data in BlockSection object
		while(studentFile.hasNext()) {
			//calling student domain objects
			Student Student = new Student();
			
			//read the input studentFile
			String rowStudent = new String();
			rowStudent = studentFile.nextLine();
			
			//split data
			String[] rowStudentSpecific = new String[4];
			rowStudentSpecific = rowStudent.split(",");
			
			//put data in Student Object
			Student.setStudNo(rowStudentSpecific[1].trim());
			Student.setName(rowStudentSpecific[2].trim());
			Student.setProgram(rowStudentSpecific[3].trim());
			
			
			//handle courseList
			//Call courseDA object w/ parameter String StudentNo
			CourseDA courseDA = new CourseDA(rowStudentSpecific[1].trim());
			Student.setCourseList(courseDA.getCourseList());
				
			studentList.add(Student);
		}//end loop
		
		//test
		for(Student student : studentList) {
			System.out.println(student);
		}
	}
}
