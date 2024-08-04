package day2;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		//conditional or ternary operator     ? :
		//we will use a logic to see if a person will be eligible to vote or not
		
		int age =25;
		//age ? "Elgible to vote" : "Not Eligible!"; //now put this into a variable then make an boolean logic
		//logic is in parenthesis
		//age ? "Elgible to vote" : "Not Eligible!";  this is formatted into 2 seperate expressions
		
		//can be put into logic statement or first make variable then print
		//System.out.println((age >=18) ? "Elgible to vote" : "Not Eligible!");
		String result= (age >=18) ? "Elgible to vote" : "Not Eligible!";
		System.out.println(result);
		
		int a = 25, b =10;
		//swap the values and print it, so a becomes 10, b becomes 25
		
		System.out.printf("Initital value of a %d b %d", a,b);   //a=25,b=10
		//another way for above print statement
		//System.out.println("initial value of a is: " +a+ " and b is: " +b);
		//%d is a format specifier
		//other format specifiers like %s(string),%d(double),%f(float),%c(char),%b(boolean)
		//%n(newline)
		

		
		a= a+b;//35
		b= a-b;//25
		a= a-b; //10
		System.out.println(); //space between statements
		System.out.printf("Final value of a %d and b %d" , a , b);
		//another way for above statement
		//System.out.println("Final value of a is: " +a+ "and b is"+b);
		
	}

}
