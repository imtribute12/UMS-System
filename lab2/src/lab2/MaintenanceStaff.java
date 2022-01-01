package lab2;

import java.util.ArrayList;

public class MaintenanceStaff extends Employee {

	private ArrayList<Locations> responsibilityArray;
	
	//encapsulation
	public ArrayList<Locations> getresponsibilityArray() {
		return responsibilityArray;
	}

	public void setresponsibilityArray(ArrayList<Locations> responsibilityArray) {
		this.responsibilityArray = responsibilityArray;
	}
	
	//constructor
	public MaintenanceStaff(String identityNumber, String name, String registryNumber) {
		super(identityNumber, name, registryNumber);
	}
	
	//function
	public void AddResponsibility(Locations location)
	{
		
	}
}
