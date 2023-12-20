package javaInterviewQuestions;

public class ReverseAnInteger {

	public static void main(String[] args) {
		int num = 12345;
		//1.Approach
		int rev =0;
		while(num!=0){
			rev = rev*10 + num%10;
			
			num = num/10;
		}
			System.out.println(rev);
			
			System.out.println("----------------------------"); 
			
			
		
		//2.Approach
			int num1 = 36987;
			StringBuffer sf = new StringBuffer(String.valueOf(num1));
			StringBuffer rever = sf.reverse();
			System.out.println(rever);
			
			
			
	}

}
