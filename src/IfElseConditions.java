
public class IfElseConditions {

	public static void main(String[] args) {
		
//		if(driver.equals("chrome")) {
//			System.out.println("Launch chrome");
//			
//		}
//		else if(driver.equals("firefox")) {
//			System.out.println("Launch firefox");
//		}
//		else if(driver.equals("opera")) {
//			System.out.println("Launch opera");
//		}
//		else {
//			System.out.println("please pass the correct browser");
//		}

		String driver = "firefox";
		switch(driver) {
		case "chrome":
			System.out.println("Launch chrome");
			break;
			
		case "firefox":
			System.out.println("Launch firefox");
			break;
			
		case "opera":
			System.out.println("Launch opera");
		    break;
		default :
			System.out.println("please pass the right browser");
			break;
		}
			
	}

}
