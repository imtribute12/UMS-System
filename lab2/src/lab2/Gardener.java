package lab2;

import java.util.ArrayList;

public class Gardener extends MaintenanceStaff {
	
	public ArrayList<Locations> gardens;
	
	//constructor
	public Gardener(String identityNumber, String name, String registryNumber) {
		super(identityNumber, name, registryNumber);

	}

	//funtions
	public void addResponsiblity(Locations location)
	{
		if(location instanceof Garden)
		{
			gardens.add(location);
		}
	}
	
	public boolean earnedHisSalary() 
	{
		int sumOfSize = 0;
		if(gardens.size()>=2) {
			for(int i = 0; i<gardens.size();i++) {
				//sumOfSize += ??
			}
		}
		return false; //min 2 garden 1Km^2 garden
	}

}
