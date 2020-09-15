package TechServ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import Domain.Course;

public class CourseDA {
	static Integer totalUnits;
	// create Array list for course data
	static ArrayList<Course> courseList;

	// constructor
	public CourseDA(String StudentNum) throws FileNotFoundException {
		Scanner courseFile = new Scanner(new FileReader("../OOP2/src/Domain/scheduleInfo.csv"));

		courseList = new ArrayList<Course>();
		totalUnits = 0;
		while (courseFile.hasNext()) {
			
			// read the input course file
			String rowCourse = new String();
			rowCourse = courseFile.nextLine();

			// split data
			String[] rowCourseSpecific = new String[6];
			rowCourseSpecific = rowCourse.split(",");

			// using String studentNo
			if (StudentNum.equals(rowCourseSpecific[0].trim())) {
				// calling Course domain object
				Course course = new Course();

				course.setCourseCode(rowCourseSpecific[1].trim());
				course.setDescription(rowCourseSpecific[2].trim());
				course.setUnit(Integer.parseInt(rowCourseSpecific[3].trim()));
				course.setDay(rowCourseSpecific[4].trim());
				course.setTime(rowCourseSpecific[5].trim());

				// adding in Array list
				courseList.add(course);
				totalUnits += course.getUnit();
			}
		}
	}

	// passing the courseList to studentDA
	public static ArrayList<Course> getcourseList() {
		return courseList;
	}

	public static Integer getTotalUnits() {
		return totalUnits;
	}
}
