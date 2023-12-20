package SuperKeyword;

public class page {
	int timeOut = 100;
	
	public page() {
		System.out.println("page default constructor");
	}
	
	public page(int a) {
		System.out.println("page single parametre constructor");
	}
	
	public page(int a,int b) {
		System.out.println("page double parametre constructor");
	}
	
	public void pageMethod() {
		System.out.println("page method");
		
	}
}
