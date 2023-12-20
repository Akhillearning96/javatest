
public class MethodOverLoading {
	
	
	public void search() {
		System.out.println("Search footwear");
	}
	public void search(String Brand,int price) {
		System.out.println("search footwear");
	}
	public void search(String Brand,int price,String type) {
		System.out.println("search footwear");
	}
	 String name = "Akhil   ";
	
	

	public static void main(String[] args) {
		
		MethodOverLoading mc = new MethodOverLoading();
//		System.out.println(mc.name);
//		System.out.println(mc.name.toUpperCase());
//		System.out.println(mc.name.trim());
		 String name = mc.name.toUpperCase().trim();
		 System.out.println(name);
		




	}

}
