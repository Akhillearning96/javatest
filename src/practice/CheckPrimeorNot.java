package practice;

import java.util.Scanner;

public class CheckPrimeorNot {
	

		public static void main(String[] args) {
		int i,j;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first number");
		int firstNumber = sc.nextInt();
		System.out.println("Please enter the second number");
		int secondNumber = sc.nextInt();
		
		for( i=firstNumber;i<=secondNumber;i++) {
			for( j=2;j<=i;j++) {
				if(i%j==0)
					break;
			}
			if(i==j)
				System.out.println(j);
			
		}

//	}
//		System.out.println("please enter the numbet to prime or not ?");
//		int num = sc.nextInt();
//		for(int i=2;i<=num;i++) {
//			if(num%i==0)
//				break;
		}
			
	
}