package interviewquestions;

import java.util.Scanner;

public class FindLargestOf3Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the values :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
	//Logic 1 - Comparison with if else conditions
		
		/*if(a>b && a>c) {
			System.out.println("largest number is :" + a);
		}else if(b>a && b>c) {
			System.out.println("largest number is : "+ b);
		}else  {
			System.out.println("largest number is :" + c);
		}*/
	//Approach -2 Ternary Operator
		int large = a>b?a:b;
		int largest = c>large?c:large;
		System.out.println(largest+ " is the largest number");

	}

}
