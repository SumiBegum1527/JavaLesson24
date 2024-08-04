package day2;

public class IncrementOperatorDemo {

	public static void main (String[] args) {
		
		//Increment operators ++
		//increase anything by one number we use ++
		
		int a= 10;
		//a= a +1; = same as a++;
		a++;
		
		System.out.println(a); //11
		
		//post increment : assign first then increase 
	/*	int x =10;
		int result =x++; //the reason why it gave result 10 because , it is assigning only
		//so x is assigning to result, thats post 
		 *so you can use preincrement to get the right result
		 * 
		System.out.println(result);//10
		System.out.println(x); //11   what this did is , after taking 10, added 1 to the value
		*/
		
		//preincrement : increase first then assign 
		int b = 20;
		int res = ++b;
		System.out.println(res); //21
		
		
		
		
		
	}
	
	
	
	
}
