package day3;

public class SwitchStatementDemo {

	public static void main(String[] args) {
	/*Conditional Statements
	 * if
	 * if else
	 * switch statement
	 */
/**
	switch(variable) {
	case 1: {
		//code
		break:
	}
	case 2: {
		//code block
		break;
	}
	default: 
	{
	}
		*/
	int num = 5; //depending on the value, it will go to the case #
	switch(num) {
	case 1: {
		System.out.println("Monday");
		break; //breaks out of the system
	}
	case 2: {
		System.out.println("Tuesday");
		break;
	}
	case 3: {
		System.out.println("Wednesday");
		break;
	}
	case 4: {
		System.out.println("Thursday");
		break;
	}
	default: {
		System.out.println("This number is not any day of the week");
		
	}
	
	}
	
	System.out.println("Out of switch statement");
	
	determineBrowser("Firefox");
	
	
	
	
	
	}
	


public static void determineBrowser(String browserName) { //not necessary for method name to have variable

		
		switch (browserName) {
		case "chrome": {
			System.out.println("Launch chrome browser.");
			break;
		}
		case "firefox": {
			System.out.println("Launch firefox browser.");
			break;
		}
		case "edge": {
			System.out.println("Launch edge browser.");
			break;

		}
		default : {
			System.out.println("This browser is not supported");
		}
		}
	}


		
	
	

	
	
}




	
	


