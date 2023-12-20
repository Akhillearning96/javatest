import java.util.Scanner;


public class ArrayList {

	public static void main(String[] args) {
		
		int year = 201975;
		int evenCount = 0;
		int oddCount = 0;
		
		while(year>0) {
			int num = year%10;
			
			year = year/10;
			evenCount++;
		}
		System.out.println(evenCount);
		//System.out.println(oddCount);
	}
	

}
