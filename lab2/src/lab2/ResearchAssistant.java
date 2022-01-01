package lab2;

public abstract class ResearchAssistant extends AssistingStaff implements CanAssistCourses,CanLabAssist,CanOverseeExams {

	Research research;
	
	//constructor
	public ResearchAssistant(String identityNumber, String name, String registryNumber) {
		super(identityNumber, name, registryNumber);
	}
	
	//functions
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
