package lab2;

import java.util.ArrayList;

public class AdministrativeStaff extends Employee {

//	!!! �dari memurlar geli�tirmekte oldu�umuz �niversite y�netim
//	sisteminin temel ta��d�r. �niversitede yap�lan her i� bu
//	memurlar taraf�ndan bir operasyon olarak yap�lmaktad�r. !!!
	
	
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
		
	}
	
	public void addOperationError(UMSException UMSException)
	{
		
	}
	
	public boolean earnedHisSalary()
	{
		return false;
	}

}
