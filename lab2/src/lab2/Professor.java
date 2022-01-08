package lab2;


public class Professor extends TeachingStaff  {

	Research research;
	
	//constructor
	public Professor(String identityNumber, String name, String registryNumber) {
		super(identityNumber, name, registryNumber);
	}
	
	//function
	public boolean earnedHisSalary() {
		return false;
	}
	
	public void addAssignment(Assignments assignment)
	{
		if(assignment instanceof UnderGraduateCourseData || assignment instanceof GraduateCourseData) {
			//olur
		}
		else if(assignment instanceof CanAssistCourses) {
			//olmaz
		}
	}
	
	public void addResearch(Research research)
	{
		this.research = research;
	}
}