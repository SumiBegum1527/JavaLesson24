package day6;

public class MethodTest {

	public static void main(String[] args) {
		/* create an object demo class to use methods from another class
		 * 2)method may or may not return any value
		 * 3) Mthod may or may not accept parameters
		 * 4) Methods can be invoked through objects
		 * 5)a method is created to perform some action
		 * 
		
		*/
		MethodDemo m	=new MethodDemo();
		m.methodOne();
		String result = m.methodTwo();
		System.out.println(result);
		
		m.methodThree("Sarmin");
		
		int sum = m.add(100, 300);
		System.out.println(sum);

	}

}
