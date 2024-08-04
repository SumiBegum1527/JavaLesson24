package day4;

public class HowManyTimesNumberRepeatedInArray {

	public static void main(String[] args) {
		
		//create an array Step 1
		int a[]= {10,30,45,30,30,40,50,20,10};
		
		//looking for a number variable #step 2
		int numLookingFor =30;
		int count=0; //#3 exclluding this number
		
		for(int value:a) { //#4
			if(value==numLookingFor) {
				count++;
			}
			
		}
		System.out.println(numLookingFor + " is present " + count + " times");
		
		

		} 
		
		
		
		
		
		
	}

