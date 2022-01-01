package lab2;

public class Academic extends Employee {

	private Assignments[] assignments;
	
	public Assignments[] getAssignment() {
		return assignments;
	}

	public void setAssignment(Assignments[] assignment) {
		this.assignments = assignment;
	}
	
	//constructor
	public Academic(String identityNumber, String name, String registryNumber) {
		super(identityNumber, name, registryNumber);

	}
	
	//functions
	public void addAssignment(Assignments assignment)
	{
		
	}
}
