package lab2;

import java.util.ArrayList;

public class CourseData {
	String courseCode = "NaN";
	String courseName = "NaN";
	TeachingStaff instructor  = null;
	AssistingStaff[] assistant = null; 
	Student[] student = null;
	private int credit;
	
	//encapsulation 
	public String getcourseCode() {
		return courseCode;
	}
	public void setcourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	public String getcourseName() {
		return courseName;
	}
	public void setcourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public TeachingStaff GetInstructor() {
		
		return this.instructor;
	}
	
	public void SetInstructor(TeachingStaff instructor) {
		
		this.instructor = instructor;
	}
	
	public AssistingStaff[] GetAssistant() {
		
		return this.assistant;
	}
	
	public void SetAssistant(AssistingStaff[] Assistant) {
		
		this.assistant = Assistant;
	}
	
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	//constructor
	public CourseData(String courseCode,String courseName) {
		this.courseCode = courseCode;
		this.courseName = courseName;
	}
	public CourseData(String courseCode, String courseName, TeachingStaff instructor) {
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.instructor = instructor;
	}
	public CourseData(String courseCode, String courseName, TeachingStaff instructor, AssistingStaff assistant) {
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.instructor = instructor;
		//this.assistants = assistant;
	}
	public CourseData(String courseCode, String courseName, TeachingStaff instructor, AssistingStaff[] assistant) {
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.instructor = instructor;
		this.assistant = assistant;
	}
	
	//functions
	
	public void enrollStudent(Student student)
	{
		//enrolls student to course, add student given as parameter to the attribute <students>
	}
	
	public ArrayList<Student> getPassedStudents()
	{
		//returns the set of students that passed the course as an arraylist.
		//[Exception] throws an exception if any of the students has a missing grade !!!
		return null;
	}
	
}

