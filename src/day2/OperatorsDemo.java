package day2;

public class OperatorsDemo {

	public static void main(String []args) {//execution needs main method 
		//Arithmetic Operators-functions like +,-,/,*,%, 
		int a= 20, b =10; //declaring varibale and assigning value to
		//declare datatype once,
		
		//System.out.println("Sum of a and b is: " +a+b); //this will concate both variables so you must put (   )
		
		System.out.println("Sum of a and b is: " +(a+b));
		System.out.println("Difference of a and b is: " +(a-b));
		System.out.println("Division of a and b is: " +(a/b));
		System.out.println("Multiplication of a and b is: " +(a*b));
		System.out.println("Modolus of a and b is: " +(a%b));
		
		//relational/comparison Operators       ==(equal), != (not equal) >, <, >=, <= 
		//returns boolean value - true or false 
		
		//int a= 20, b =10;
		
		System.out.println(a>b); //true
		System.out.println(a<b); //false
		System.out.println(a>=b); //true    >= is either OR thats why its true
		System.out.println(a<=b); //false
		System.out.println(a==b); //false
		System.out.println(a!=b); //true
		
		//logical operators   :
		//&& (and), || (or) , !(not)- reverse the whole statement  
		//will return boolean value : true or false
		//works with 2 boolean values
		
		boolean x = true, y =false; //declared 2 variables that holds boolean values
		System.out.println(x && y); //will return TRUE if both is TRUE or its false
		System.out.println(x || y); //true if one is true
		System.out.println(!x); //false, nottrue
		System.out.println(!y);//true, notfalse
		
		
		
	}
}
