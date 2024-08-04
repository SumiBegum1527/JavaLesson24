package day4;

import java.util.Arrays; //isnt inside the pkg so we must import

public class ArrayDemo {
//arrays, two ways in declaring, different ways to assign values, extracting values
	
	
	public static void main(String[] args) {
		/*a concept in java that we use to store a large amount of values in a single 
		 * variable, but the values have to be the same type. 
		
		int myArray[]= new int[100];  //one way to declare
		int[] myArray= new int[79];	//another way to declare but means the exact same
		 */
		
	//	int myArray[] = new int[5];
		int[] myArray= new int[5];
		
		myArray[0]= 10;
		myArray[1]= 20;
		myArray[2]= 30;
		myArray[3]= 40;
		myArray[4]= 50;
		
		//extract value from the array
		System.out.println(myArray[4]); //50
		
		System.out.println(Arrays.toString(myArray));// will show all values in one line
		
		//finding out length of an array
		int length = myArray.length;   
		System.out.println("The length is: "  +length);
		
		//print all values
		//for(int i=0; i<5; i++) {
			//System.out.println(a[i]); or Syste.....(myArray[i]);
		
		//enahanced loop print all values
		System.out.println("*********using enhanced for loop******");
		for(int mA:myArray) {
			System.out.println(mA);
		}
		System.out.println("print in reverse order");
		//printing values from last index to the first index
		for(int i =myArray.length-1; i>=0;i--) {
			System.out.println(myArray[i]);
			
			//System.out.println(a; //not possible);arrays dont pass values with only variable mst with index
		
		//myway below
			//for(int i=0; i<=myArray.length-1; i++) {
			//System.out.println(myArray[i]);
			
			//declaring and assinging alues at one go
			int a[]= {1,2,3,4,5}; //another way which is the better way to enter values
			System.out.println(a[4]);
		}
		
	}
}

