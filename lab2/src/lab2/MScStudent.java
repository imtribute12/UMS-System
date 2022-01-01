package lab2;


public class MScStudent extends GraduateStudent {
	//constructor
	public MScStudent(String studentNumber, int enrollmentYear) {
		super(studentNumber, enrollmentYear);
	}
	public MScStudent(String studentNumber, int enrollmentYear, Transcript transcript) {
		super(studentNumber, enrollmentYear, transcript);
	}
	
	//functions
	public boolean checkGraduation() {
		
		return false;
	}
	public int getPassedCredit() {
		
		return 0;
	}

	public void addCourse(CourseData CourseData) throws Exception
	{
//		 Only adds a graduate course.
//		 throws “Course Type and Student Type
//		 Inconsistency Exception” if course and
//		 student types are inconsistent
	}
	
}
