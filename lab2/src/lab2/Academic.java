package lab2;

import java.util.ArrayList;

public class Academic extends Employee {
	
	private ArrayList<Assignments> assignments;
	
	//encapsulation
	public ArrayList<Assignments> getAssignment() {
		return assignments;
	}

	public void setAssignment(ArrayList<Assignments> assignment) {
		this.assignments = assignment;
	}
	
	//constructor
	public Academic(String identityNumber, String name, String registryNumber) {
		super(identityNumber, name, registryNumber);

	}
	
	//functions
	public void addAssignment(Assignments assignment)
	{
		if(assignment instanceof Academic) {
			
		}
	}
}
