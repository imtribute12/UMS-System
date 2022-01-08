package lab2;

import java.util.ArrayList;

public class UnderGraduateCourseData extends CourseData {

	// constructors
	public UnderGraduateCourseData(String courseCode, String courseName) {
		super(courseCode, courseName);
	}

	public UnderGraduateCourseData(String courseCode, String courseName, TeachingStaff instructor) {
		super(courseCode, courseName,instructor);
	}

	public UnderGraduateCourseData(String courseCode, String courseName, TeachingStaff instructor,
			AssistingStaff assistant) {
		super(courseCode, courseName,instructor);
	}

	public UnderGraduateCourseData(String courseCode, String courseName, TeachingStaff instructor,
			ArrayList<AssistingStaff> assistant) {
		super(courseCode, courseName,instructor,assistant);
	}

	//functions
	public void enrollStudent(Student student)
	{
//		enrolls only undergraduate students using
//		enrollStudent function of super class
	}
	
	public ArrayList<Student> getPassedStudents()
	{
//		uses passing criteria defined for
//		undergraduate students

		return null;
	}
}
