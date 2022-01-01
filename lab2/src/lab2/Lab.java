package lab2;

import java.util.ArrayList;

public class Lab extends Locations {
	
	public Lab(String identifier, String address, double space, ArrayList<MaintenanceStaff> responsibles) {
		super(identifier, address, space, responsibles);
	}

	public void CheckComputers() {
		
	}
	
	public boolean isProperlyMaintaned() {
		return false;
	}
}
