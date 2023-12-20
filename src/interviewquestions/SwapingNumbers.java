package interviewquestions;

public class SwapingNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before swaping "+ a+":"+b);
		 
	//Logic-1 - By using third value
		
		/*int c = a;
		a = b;
		b = c;*/
		
		
	//Logic-2 without third value using + & -
		/*a = a+b; //10+20=30;
		b = a-b; //30-20=10;
		a = a-b; //30-10=20;*/
		
	//Logic-3 with * & / operators
		/*a=a*b;
		b=a/b;
		a=a/b;*/
		
	//Logic-4 in single line
		//b=a+b-(a=b);
		System.out.println("Before swaping "+ a+":"+b);

	}

}
