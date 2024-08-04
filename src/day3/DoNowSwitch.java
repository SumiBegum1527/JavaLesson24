package day3;

public class DoNowSwitch {

	public static void main(String[] args) {
	
		String browser= "Chrome";
		
		switch (browser) {
		case "Chrome": {
			System.out.println("Chrome is launched");
			break;
		}
		case "Firefox": {
			System.out.println("Firefox is launched");
			break;
		}
		case "Edge": {
			System.out.println("Edge is launched");
			break;

		}
		default : {
			System.out.println("This is not a browser");
		}
		}
	}
}

		
	
	
