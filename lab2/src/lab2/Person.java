package lab2;


public class Person {

	private String identityNumber;//11 haneli
	private String name;//50-10 arasý
	
	//encapsulation field
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
//		[Exception] setIndentityNumber throws
//		“Person Identity Number Length Mismatch
//		Exception”
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception{
		this.name = name;
		//Exception] setName throws “Person Name
		//Too Long Exception” or “Person Name Too
//		Short Exception”
	}
	
	//constructor
	public Person(String identityNumber, String name) {
		this.identityNumber = identityNumber;
		this.name = name;
	}
	
}
