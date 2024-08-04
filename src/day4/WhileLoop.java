package day4;

public class WhileLoop {

	
	public static void main(String[] args) {
		//only diffrence between fr loop and while loop is the way you construct it
		//any type of loop we need these 3 things
		//initialization; condition/logic; increment/decrement
		System.out.println("*********Using For Loop********".repeat(2));
		for(int num=1; num<=5; num++) { //= the synthax for for loop
			System.out.println(num);
		}
		System.out.println("*********Using While Loop********".repeat(2));
			
		
		//print 1 to 5 using while loop
		
		//int num= 5; //declare the #
		int num= 1; //but I choose this because I want to start at 1
		while(num <=5) {
			System.out.println(num);
			num++;
		}
	//print 1 to 5 using do while loop
		System.out.println("*********Using DO While Loop********".repeat(2));
		int number =1; 
		do{
			System.out.println(number); //start at 1
			System.out.println("****John****"); //comment out the line above if you dont wanna see the #
			number++; //increment
		}while(number<=5); //add condition
		}
	
	}

