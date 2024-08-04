package day2;

public class AssignmentOperatorDemo {
	
	
	public static void main (String[] args) {
		
	//Assignment (shorthand)    =,  +=  , -+  , *=,  /=,  %=   
		//(called shorthand because all have = sign) 
		
	//Example1
	/*	int a =10;
		//a= a+5; //can be written another way a+=5;
		a+=5;
		System.out.println(a); //15
		 */
	//Example2
		int a=10;
		
		a-=5;  //what it means a=a-5;
		System.out.println(a);//5
	
		
	//Example3 (mul a by 5)
		
		a*=5;  //previous answer 5...then 5*5=25
		System.out.println(a);
		
	//Example4 (div a by 4)
		a/=4;
		System.out.println(a);
		
	//Example5 (modulus a by 4)
		a%=4;  
	//modulus means the # that is remainder...2 is the remainder 6/4=1.2 (2 is the remainder)
		System.out.println(a);
	}

}
