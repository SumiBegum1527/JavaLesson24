package day4;

public class WhileLoop2 {

	public static void main(String[] args) {
		// Jumping Statement 1) Break 2) continue

		//situation 1
		for (int i=1; i<=10;i++) {
			System.out.println(i);
			
			//I want to skip 6 through 10
			if(i==5) {
				break;// this is a jump statement 
			}
	}
		//situation 2
		System.out.println("Situation 2");
		//situation 2: {Print all the numbers less 5
			for (int i=1; i<=10;i++) {
				if(i==5) {
					continue; //skip the current sequence
				}
				System.out.println(i);
			}
				
					
			}

}
