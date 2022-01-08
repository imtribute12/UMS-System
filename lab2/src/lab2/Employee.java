package lab2;


public class Employee extends Person {
	private String registryNumber;
	private float salary;
	
	//constructors
	public Employee(String identityNumber, String name, String registryNumber) {
		super(identityNumber, name);
		this.registryNumber = registryNumber;
	}
	
	//encapsulaton field
	public String getRegistryNumber() {
		return registryNumber;
	}
	public void setRegistryNumber(String registryNumber) throws Exception{
		this.registryNumber = registryNumber;
		//Exception] setRegistryNumber throws
		//“Registry Number Length Mismatch
//		Exception”
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) throws Exception {
		this.salary = salary;
//		[Exception] setSalary throws “Salary
//		Initialization Exception”
	}

	//functions
	public boolean earnedHisSalary() {
		return true;
	}
	
	public float paySalary() {
		return 0;
//		Pays salary to the employee
//		 Returns the amount of paid salary
//		 throws “Salary Can Not Be Paid Exception” if
//		the employee did not earn his/her salary.
//		throws “Overtime Payment Required
//		Exception” if the employee is eligible for
//		overtime payment.
//		 Only Maintenance Staff is eligible for
//		overtime payment.
//		 Overtime payment criteria is given as
//		“Overtime Payment Criteria.
	}
}
