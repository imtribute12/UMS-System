package lab2;

public abstract class Lecturer extends TeachingStaff implements CanAssistCourses {
	//constructor
	public Lecturer(String identityNumber, String name, String registryNumber) {
		super(identityNumber, name, registryNumber);
	}
	
	//function
	public boolean earnedHisSalary() {
		return false;
	}
	
	public void addAssignment(Assignments assignment)
	{
		
	}
}
