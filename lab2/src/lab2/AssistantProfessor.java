package lab2;


public class AssistantProfessor extends TeachingStaff {

	Research research;
	
	//constructor
	public AssistantProfessor(String identityNumber, String name, String registryNumber) {
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
