package day4;

public class OddandEven {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,5,6,7,8,9,10}; //#step 1
		
		int even=0; //#step 2
		int odd=0; //#step 3
		
		//create enhance loop #step 4
		
		for(int var:a) {
			if(var%2 ==0) {
				even++;
			}else {
				odd++;

		} 

		 
	}
		System.out.println("Number of even numbers: " + even);
		System.out.println("Number of odd numbers: " + odd);
	

	}
}
