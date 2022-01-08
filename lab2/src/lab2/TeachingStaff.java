package lab2;


public class TeachingStaff extends Academic {
	
	private String officeHours = "NaN";
	private Office office;
	
	//encapsulation
	public String getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public Office getOffice() {
		return office;
	}
	public void setOffice(Office office) {
		this.office = office;
	}

	//constructor
	public TeachingStaff(String identityNumber, String name, String registryNumber) {
		super(identityNumber, name, registryNumber);
		
	}
}
