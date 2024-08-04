package day2;

public class IfCondition {

	public static void main(String[] args) {
		/*Conditional statements
		 * if
		 * if else
		 * switch statement
		 * 
		 * 
		 * 
		 * if(boolean statement) {
		 * block od code or statement
		 * }
		 */
		// Example 1:
		if(true) {
			System.out.println("We speak the truth.");
		}
		System.out.println("End of the program");
	
		
		//Example 2:
		int person_age = 10;
		if(person_age >=18 ) {
			System.out.println("Eligible to vote.");//if block true this will be executed
		}else {
			System.out.println("Not eligible to vote"); //if block is false so this will be executed
		}
		System.out.println("End of the program");

	}

}
