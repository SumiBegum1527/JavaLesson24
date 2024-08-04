package day5;

public class StringManipulation {

	public static void main(String[] args) {
		// Strings are immutable- it can not be changed
		//String is a collection of characters
		String s = "Welcome"; //string literal
		String s2 = new  String("Welcome"); //through string object
		
		//to learn important methods of String class
		
		//length()---counts all the characters in a string and returns the number in int data type
				//return in integer #
		int length = s2.length();
		System.out.println("The length is: " +length);
		
		//check length for 2 object
		System.out.println(s.length()); //11
		
		//concat() - join multiple strings together
		String s1= "Welcome";
		String s3= " to java" ;
		String s4 = " programming.";
		System.out.println(s1 + s3); //method chain 
		System.out.println(s1.concat(s3).concat(s4)); //Welcome to java programming.
		
		//trim() - would trim any leading and trailing spaces from a string
		//helps with comparing strings
		//leading soace befire string, trailing space after string
		s= "       welcome to java      ";
		System.out.println(s.length());
		System.out.println(s.trim().length());
		
		//charAt() -return a single character out of a string from a specific index
		//index starts from 0
		//-string is an array of characters
		s= "Java Selenium";
		System.out.println(s.charAt(5)); //S
		
		//contains() --returns a boolean (true/false)
		//check a string is the part of the main string or not
		//its case sensitive too
		//do not juggle around or it will be false
		System.out.println(s.contains("jav")); //false because j is lower case
		System.out.println(s.contains("Jav")); //True
		System.out.println(s.contains("Sel")); //True
		System.out.println(s.contains("ium")); //true
		System.out.println(s.contains("Sli")); //False
		System.out.println(s.contains("a S")); //true
		
		//equals(0, equalsIgnoreCase()---->compares two strings and returns boolean value 
		s1= "Welcome";
		s2 = "welcome";
		System.out.println(s1.equals("welcome"));//false
		System.out.println(s1==s2); //false
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		
		//replace() --it replaces a single character or character sequence of a gien string 
		s = "welcome to java selenium automation";
		System.out.println(s.replace("w","W"));
		System.out.println(s.replace("java", "python"));
		
		//substr(0-----extracts subtring from the main string
		//overloading method, same method name, two signatures thats why its overloading method
		System.out.println(s.substring(11)); //java selenium automation
		System.out.println(s.substring(11,15)); //java
		
		//toUpperCase() ---toLowerCase()---> converts cases
		s= "Welcome";
		System.out.println(s.toUpperCase()); //WELCOME;
		System.out.println(s.toLowerCase());  //welcome
		
		//split() --split or divide original string into multiple parts based on delimiter 
		//a string into strings
		s= "abc@xyz";
		//because you are splitting into two segments you need to use it in array []
		String a[]=s.split("@");
		System.out.println(a[1]); //index starts at 0, so [0}= abc , [1]= xyz
		// can not do this = System.out.println(s.split("@"));
		s = "welcome to java selenium automation";
		String b[]= s.split(" ");
		System.out.println(b[3]); //selenium 
		
		//replace empty space with underscore
		System.out.println(s.replace(" ", "_"));
		
		//extract only abc from the following string 
		s= "abc,123@m.com";
		String[] c = s.split(",");
		System.out.println(c[0]); //abc
		
		
	}

}
