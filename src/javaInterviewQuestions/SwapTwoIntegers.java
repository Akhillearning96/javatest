package javaInterviewQuestions;

public class SwapTwoIntegers {

	public static void main(String[] args) {
		
		
		int x = 5;
		int y =10;
		//1.Approach : with third value
		//int t ;
		
//		t=x;//5
//		x=y;
//		y=t;
//		System.out.println(x);
//		System.out.println(y);
		
		System.out.println("--------------------------");
		
		//2.Approach : without third value
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x);
		System.out.println(y);
		
		
		
		

	}

}
