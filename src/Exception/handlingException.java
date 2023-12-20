package Exception;

public class handlingException {

	public static void main(String[] args) {
		System.out.println("A--Hello");	
		System.out.println("A--How are you?");
		
		try {
		int i=9/0;
		System.out.println(i);
		}catch(Throwable e) {
		//System.out.println("Arithmetic Exception is coming....");
		
	}
		System.out.println("B--I am good");
		System.out.println("B--What about you?");

}
}
