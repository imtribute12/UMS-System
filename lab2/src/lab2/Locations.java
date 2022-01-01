package lab2;

import java.util.ArrayList;

public class Locations {
	private String identifier = "NaN";
	private String address = "NaN";
	private double space = -1;
	private ArrayList<MaintenanceStaff> responsibles;
	
	//encapsulation
	public String getIdentifier() {
		return identifier;
	}
	
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public double getSpace() {
		return space;
	}
	
	public void setSpace(double space) {
		this.space = space;
	}
	
	public ArrayList<MaintenanceStaff> getResponsibles() {
		return responsibles;
	}
	
	public void setResponsibles(ArrayList<MaintenanceStaff> responsibles) {
		this.responsibles = responsibles;
	}

	//constructor
	public Locations(String identifier, String address, double space, ArrayList<MaintenanceStaff> responsibles) {
		this.identifier = identifier;
		this.address = address;
		this.space = space;
		this.responsibles = responsibles;
	}
	
	//function
	public void addResponsible(MaintenanceStaff maintenanceStaff)
	{
		
	}
	
	public boolean isProperlyMaintained()
	{
//		RETURNS true with 85% probability
//		For testing purposes of course

		return false;
	}
}
