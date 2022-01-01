package lab2;


public class AssistingStaff extends Academic {

	private Lab lab;
	
	//encapsulation
	public Lab getLab() {
		return lab;
	}

	public void setLab(Lab lab) {
		this.lab = lab;
	}
	
	//constructor
	public AssistingStaff(String identityNumber, String name, String registryNumber) {
		super(identityNumber, name, registryNumber);
	}

}
