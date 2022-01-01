package lab2;

import java.util.ArrayList;

public class UnderGraduateCourseData extends CourseData {

	// constructors
	public UnderGraduateCourseData(String courseCode, String courseName) {
		super(courseCode, courseName);
		this.courseCode = courseCode;
		this.courseName = courseName;
	}

	public UnderGraduateCourseData(String courseCode, String courseName, TeachingStaff instructor) {
		super(courseCode, courseName,instructor);
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.instructor = instructor;
	}

	public UnderGraduateCourseData(String courseCode, String courseName, TeachingStaff instructor,
			AssistingStaff assistant) {
		super(courseCode, courseName,instructor);
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.instructor = instructor;
		// this.assistants = assistant;
	}

	public UnderGraduateCourseData(String courseCode, String courseName, TeachingStaff instructor,
			AssistingStaff[] assistant) {
		super(courseCode, courseName,instructor,assistant);
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.instructor = instructor;
		this.assistant = assistant;
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
