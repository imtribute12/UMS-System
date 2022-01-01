package lab2;


public class GraduateStudent extends Student {
	//constructors
	public GraduateStudent(String studentNumber, int enrollmentYear) {
		super(studentNumber, enrollmentYear);
	}
	public GraduateStudent(String studentNumber, int enrollmentYear, Transcript transcript) {
		super(studentNumber, enrollmentYear, transcript);
	}
	
	//functions
	public boolean checkGradution()
	{
		return true;
	}
	
	public void addCourse(CourseData CourseData) throws Exception
	{
//		 Only adds a graduate course.
//		 throws �Course Type and Student Type
//		 Inconsistency Exception� if course and
//		 student types are inconsistent
	}
	
	public int getPassedCredit()
	{
		return 0;
	}
}
