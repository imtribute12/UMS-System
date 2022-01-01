package lab2;

import java.util.ArrayList;

public class GraduateCourseData extends CourseData {
	//constructors
	public GraduateCourseData(String courseCode, String courseName) {
		super(courseCode, courseName);
	}
	public GraduateCourseData(String courseCode, String courseName, TeachingStaff instructor) {
		super(courseCode, courseName, instructor);
	}
	public GraduateCourseData(String courseCode, String courseName, TeachingStaff instructor,
			AssistingStaff assistant) {
		super(courseCode, courseName, instructor, assistant);
	}
	public GraduateCourseData(String courseCode, String courseName, TeachingStaff instructor,
			AssistingStaff[] assistant) {
		super(courseCode, courseName, instructor, assistant);
	}
	
	//functions
	public void enrollStudent(Student student)
	{
//		enrolls only graduate students using
//		enrollStudent function of super class	
	}
	
	public ArrayList<Student> getPassedStudents()
	{
		//returns the set of students that passed the course as an arraylist.
		//[Exception] throws an exception if any of the students has a missing grade !!!
		return null;
	}
	
}
