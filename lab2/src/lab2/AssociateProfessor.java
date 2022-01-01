package lab2;


public abstract class AssociateProfessor extends TeachingStaff implements CanAssistCourses,CanConductResearch{

	Research research;
	
	//constructor
	public AssociateProfessor(String identityNumber, String name, String registryNumber) {
		super(identityNumber, name, registryNumber);
	}
	
	//function
	public boolean earnedHisSalary() {
		return false;
	}
	
	public void addAssignment(Assignments assignment)
	{
		
	}
	
	public void addResearch(Research research)
	{
		
	}
}

//Can give both Undergraduate and Graduate Courses
//Can not take an assisting assignment