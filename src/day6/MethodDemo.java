package day6;

public class MethodDemo {

	//No params and no return 
	
	public void methodOne() {
		System.out.println("Hey, we are learning method");
	}
	
	//no params Return Value
	
	//public String method() {
		//return("How are you doing?");
	
	public String methodTwo() {
		String a= "Hello.";
		String b= " How are you?";
		return a+b;
	}
	
	//3) Accepts a param but does not return 
	public void methodThree(String name) {
		System.out.println(name + ", how are you?");
	}
	
	//Accepting params and returning values
	public int add(int a, int b) {
		return(a+b);
	}
}
