package lab2;

import java.util.ArrayList;

public class Garden extends Locations {
	
	public ArrayList<MaintenanceStaff> garden;
	
	//constructor
	public Garden(String identifier, String address, double space, ArrayList<MaintenanceStaff> responsibles) {
		super(identifier, address, space, responsibles);
	}
	
	//function
	public void addResponsible(MaintenanceStaff maintenanceStaff)
	{
		if(maintenanceStaff instanceof Gardener)
		{
			garden.add(maintenanceStaff);
		}
	}

}
