package interviewquestions;

import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		System.out.println("Actual number is :");
		
	//	int num = sc.nextInt();
		
	//1st method -- Algorithm 
		/*int rev = 0;
		
		while(num!=0){
			
			rev = rev*10 + num%10;
			num=num/10;
		}*/
		
	//2nd method -- String Buffer
		/*StringBuffer sb = new StringBuffer(String.valueOf(num));
		
		StringBuffer rev = sb.reverse();
		
		*/
		
	//3rd method -- String Builder
		/*StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		System.out.println("After reversing number is :"+rev);*/
		

	}

}
