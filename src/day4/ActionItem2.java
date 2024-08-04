package day4;

public class ActionItem2 {

	public static void main(String[] args) {
		//factorial means # multiply by preceding numbers

		System.out.println("Factorial is : " +doFactorial(20) ); //# can be chnanged to anything
		System.out.println("The Celcius is: " +convertToFarhenheit(23));
	}
//create a method and convert 
	//first d factorial//then convert
	public static long doFactorial(int number) {  //declare parameter, the mthod will accept integer #
	//int you dont have to change , int just shows its a number
		//declare a new int type variable
		long factorial =1;
		
		//in while the parameter in parameter 
		while(number >1) {
			//create shorthand operator
			factorial *=number; // we are multiplying subsequent values with factorial
			number --; //decrementing every iteration
		}
		
		return factorial; //returning the calculated value
		
		
	}
	
	//Actiion Item 2 Q6
	
	public static double convertToFarhenheit(int celcius) {
		double fahrenheit; //declare variable
		fahrenheit = ((celcius *9)/5) +32; //conversion formula
		return fahrenheit; //will bring the calc with value
	}
}
