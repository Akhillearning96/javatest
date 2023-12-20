package Exception;

public class ThrowsKeyword {
	

	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	public void m3() throws ArithmeticException{
		System.out.println("m3 method");
		try {
		int i =9/0;
		System.out.println(i);
		}catch(ArithmeticException e) {
			System.out.println("AE is coming.....");
			e.printStackTrace();
		}
		System.out.println("Hello");
		
	}

	public static void main(String[] args) {
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		

	}

}
