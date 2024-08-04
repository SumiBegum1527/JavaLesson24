package day4;

import java.util.Scanner;

public class SearchingElementInArray {
	
	//searching an element from an array
	public static void main(String[] args) {
		
		//create an array step 1
		int a[]= {10,40,20,30,60,50,90,80};
		
		//predefined class called scanner, used to take user input
		Scanner scan=new Scanner(System.in);
		System.out.println("Please type a number to search for.");
		
		
		//create a boolean variable step 2
		boolean status= false; //create a flag/status state
		
		//step 4 declare a number for search for
		int searchNum= scan.nextInt(); 
		for(int i=0; i<a.length;i++) { //step 3
			//step #4
			if(searchNum==a[i]) {
		
			System.out.println("Element found!!"); //step#5
			status= true;
			break; //if we find the number we dont need to continue looking for it so
			//we use break statement Step #6
		}
		}
		
		//if not found make another statement step #7
		if(status==false) {
			System.out.println("Sorry!!! Element not found.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
