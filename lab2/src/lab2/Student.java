package lab2;


public class Student {
	
	private String studentNumber;//9 haneli
	private int enrollmentYear;//2000-2022 arasý
	private Transcript transcript; //CourseData’s and Grades of past semesters
	private CourseData[] courseData;
	
	//encapsulation field
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) throws Exception{
		this.studentNumber = studentNumber;
//		 [Exception] setstudentNumber throws
//		 “Student Identity Number Length Mismatch
//		 Exception”
	}
	public int getEnrollmentYear() {
		return enrollmentYear;
	}
	public void setEnrollmentYear(int enrollmentYear) throws Exception {
		this.enrollmentYear = enrollmentYear;
//		setEnrollmentYear throws
//		“Enrollment Year Exception”
	}
	public Transcript getTranscript() {
		return transcript;
	}
	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}
	public CourseData[] getCourseData() {
		return courseData;
	}
	public void setCourseData(CourseData[] courseData) {
		this.courseData = courseData;
	}
	
	//constructors
	public Student(String studentNumber, int enrollmentYear) {
		super();
		this.studentNumber = studentNumber;
		this.enrollmentYear = enrollmentYear;
	}
	public Student(String studentNumber, int enrollmentYear, Transcript transcript) {
		super();
		this.studentNumber = studentNumber;
		this.enrollmentYear = enrollmentYear;
		this.transcript = transcript;
	}
	
	//funtions
	public int getTotalCredit()
	{
		return 0;
	}
	
	public int getPastCredit()
	{
		return 0;
	}
	
	public int getPassedCredit()
	{
		return 0;
	}
	
	public int getCurrentCredit()
	{
		return 0;
	}
	
	public boolean checkGradution()
	{
		return true;
	}
	
	public void addCourse(CourseData CourseData) throws Exception
	{
//		Add a course to current semester
//		throws “Course Type and Student Type
//		Inconsistency Exception” if course and
//		student types are inconsistent

	}
	
	public boolean checkCourseByName(CourseData courseName)
	{
		return true;
	}
	
	public boolean checkCourseByCode(CourseData courseCode)
	{
		return true;
	}
	
	public boolean checkPassedCourseByName(CourseData courseName)
	{
		return true;
	}
	
	public boolean checkPassedCourseByCode(CourseData courseCode)
	{
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
}
