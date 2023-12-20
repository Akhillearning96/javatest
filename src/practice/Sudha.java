package practice;

public class Sudha {

	public static void main(String[] args) {
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i.length);
		
//		for(int k=0;k<i.length;k++) {
//			System.out.println(i[k]);
		
		for(int k : i) {
			System.out.println(k);
			
			
		}
		PracticeJava pj = new PracticeJava("Akhil",4432,"Mechanical");
		

	}

}
