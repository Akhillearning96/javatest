package OOPS;

public class TryCatchBlock {
	String institute;

	public static void main(String[] args) {
		System.out.println("Venkata ramana");
		System.out.println("Aruna");
		System.out.println("HBA");
		
		TryCatchBlock t = new TryCatchBlock();
		t.institute = "Chennuru";
		t = null;
		try {
			
		}
		catch(Throwable e) {//Exception is parent class of All Exceptions
			e.printStackTrace();	
		}
		
		
		System.out.println("Hello");
		System.out.println("How Are You");
		

	}

}
