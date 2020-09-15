package TechServ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import Domain.Student;

public class StudentDA {
	static ArrayList<Student> studentList;
	static Integer totalNumberOfStudent;

	// constructor
	public StudentDA(String blockCode) throws FileNotFoundException {
		Scanner studentFile = new Scanner(new FileReader("../OOP2/src/Domain/studentInfo.csv"));

		// create Array list for student Data
		studentList = new ArrayList<Student>();
		totalNumberOfStudent = 0;
		
		// put data in BlockSection object
		while (studentFile.hasNext()) {
			
			// read the input studentFile
			String rowStudent = new String();
			rowStudent = studentFile.nextLine();

			// split data
			String[] rowStudentSpecific = new String[4];
			rowStudentSpecific = rowStudent.split(",");

			if (blockCode.equals(rowStudentSpecific[0].trim())) {

				// calling student domain objects
				Student Student = new Student();

				// put data in Student Object
				Student.setStudentNumber(rowStudentSpecific[1].trim());
				Student.setName(rowStudentSpecific[2].trim());
				Student.setProgram(rowStudentSpecific[3].trim());

				// handle courseList
				// Call courseDA object w/ parameter String StudentNo
				CourseDA courseDA = new CourseDA(rowStudentSpecific[1].trim());
				Student.setCourseList(CourseDA.getcourseList());
				Student.setTotalUnitsEnrolled(CourseDA.getTotalUnits());
				studentList.add(Student);
				totalNumberOfStudent++;

			} // end if state.

		} // end loop
	}

	public static Integer getTotalNumberOfStudent() {
		return totalNumberOfStudent;
	}

	public static ArrayList<Student> getStudentList() {
		return studentList;
	}
}
