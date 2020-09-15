package TechServ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import Domain.Course;

public class CourseDA {
	static Integer totalUnits;
	static ArrayList<Course> courseList;
	public CourseDA(String studentNum) throws FileNotFoundException {
		
		Scanner courseFile = new Scanner(new FileReader("../Aggregation-COMReportVer.2/src/Domain/scheduleInfo.csv"));
		
		courseList = new ArrayList<Course>();
		totalUnits = 0;
		
		while(courseFile.hasNext()) {
			String rowCourse = new String();
			rowCourse = courseFile.nextLine();
			
			String[] rowCourseSpecific = new String[6];
			rowCourseSpecific = rowCourse.split(",");
			
			if(courseList.equals(rowCourseSpecific[0].trim())) {
				
				Course course = new Course();
				
				course.setCourseCode(rowCourseSpecific[1].trim());
				course.setDescription(rowCourseSpecific[2].trim());
				course.setUnit(Integer.parseInt(rowCourseSpecific[3].trim()));
				course.setDay(rowCourseSpecific[4].trim());
				course.setTime(rowCourseSpecific[5].trim());
				
				courseList.add(course);
				totalUnits+=course.getUnit();
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
