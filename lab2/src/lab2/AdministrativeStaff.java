package lab2;

import java.util.ArrayList;

public class AdministrativeStaff extends Employee {

//	!!! Ýdari memurlar geliþtirmekte olduðumuz üniversite yönetim
//	sisteminin temel taþýdýr. Üniversitede yapýlan her iþ bu
//	memurlar tarafýndan bir operasyon olarak yapýlmaktadýr. !!!
	
	
	private ArrayList<Operation> performedOperations;
	private ArrayList<UMSException> errors;
	
	//encapsulation
	public ArrayList<Operation> getPerformedOperations() {
		return performedOperations;
	}
	
	public void setPerformedOperations(ArrayList<Operation> performedOperations) {
		this.performedOperations = performedOperations;
	}
	
	public ArrayList<UMSException> getErrors() {
		return errors;
	}
	
	public void setErrors(ArrayList<UMSException> errors) {
		this.errors = errors;
	}
	
	//constructor
	public AdministrativeStaff(String identityNumber, String name, String registryNumber) {
		super(identityNumber, name, registryNumber);
	}
	
	//functions
	public void addPerformedOperation(Operation operation)
	{
		performedOperations.add(operation);
	}
	
	public void addOperationError(UMSException UMSException)
	{
		errors.add(UMSException);
	}
	
	@Override
	public boolean earnedHisSalary()
	{
		if(performedOperations.size() >= 10 && errors.size()<performedOperations.size()*10/100) {
			return true;
		}
		return false;
	}

}
