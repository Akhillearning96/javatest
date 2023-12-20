package interviewquestions;

import java.util.Scanner;

public class CountEvenorOddDigitsInaNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number :");
		int num = sc.nextInt();
		int rem = 0;
		int even_count = 0;
		int odd_count  = 0;
		 
		while(num>0) {
			rem =  num%10;// Each time we will get the remainder of num
			num = num/10;
			if(rem%2==0) {
				even_count++;
				
			}else {
				odd_count++;
			}
		}
		 System.out.println("Even digits count is : "+ even_count);
		 System.out.println("Odd digits count is : "+ odd_count);
	}

}
