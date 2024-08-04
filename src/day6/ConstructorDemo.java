package day6;

public class ConstructorDemo {
//are made to assig values to variables
	String name;
	String streetName;
	int houseNumber;
	String zipCode;
	
	//constructor 
	//no return type but same as class name
	//may have parameters or no parameters 
	
	
	public ConstructorDemo(String name, String streetName, int houseNumber,
	String zipCode) {
		//purpose of using this keyword
		this.name=name;
		this.streetName=streetName;
		this.houseNumber= houseNumber;
		this.zipCode=zipCode;
		
	}
	
	public String declareAddress() {
		return(name+ "\n" +houseNumber+ ". " + streetName + "\n" +zipCode);
		
	}
	
	
	
}
