package day4;

public class TwoDimensionalArray {

	
	
	public static void main(String [] args) {
		
		//declaration
		int a[][] = new int[3][2]; //3is outer 2 is inside 3
		
		//assigning values to the cells
		a[0][0]=100;
		a[0][1]=200;
	
		a[1][0]= 600;
		a[1][1]= 700;
		
		a[2][0]= 800;
		a[2][1]= 900;
		
		System.out.println(a[1][1]);// 700
		
		//use enhanced loop
		int b [][]= {{1,10}, {3,4,23},{5,6,24,67,45}};
		
		System.out.println(b[2][1]);
		System.out.println("Printing all the values");
		//to print 2 dimensional array you must use 2 for loops!!!!
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
		}
		System.out.println("Printing all the values from b array");
		for(int i=0; i<b.length; i++) {
			for (int j=0; j<b[i].length; j++) {
				System.out.println(b[i][j]);
			}
		}
		
		//same thing with enhanced forloop
		System.out.println("Extracting all the values using enchanced for loop");
				for(int[] arr:b) { //I declare arr here not previous
					for(int x:arr) { //declare into another variable
						System.out.print(x + " ");
					}
					System.out.println(); //after each running array it will go to the next line
				}
		
		
		
	}
}

		
		
		
	

