package lab2;

public abstract class TeachingAssistant extends AssistingStaff implements CanAssistCourses,CanOverseeExams {
	
	//constructor
	public TeachingAssistant(String identityNumber, String name, String registryNumber) {
		super(identityNumber, name, registryNumber);
	}
	
	//funtions
	public boolean earnedHisSalary() {
		
		return false;
	}
	
	public void addAssignment(Assignments assignment) {
		
	}
}
