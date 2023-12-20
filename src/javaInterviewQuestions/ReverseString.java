package javaInterviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Akhil";
		//1.Approach
		
		// String is immutable so it cannot be changed.so it don't have reverse method 
		// String Buffer is mutable so it is having reverse method directly
		
		
		int length = s.length();
		System.out.println(length);
		
		String rev = "";
		
		for(int i=length-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	
	    //2.Approach
		StringBuffer sb = new StringBuffer(s);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);
		
		System.out.println("---------------------------");
		
		//3.Approach
		String spl[] = s.split("");
		String reve = "";
		for(int i=length-1;i>=0;i--) {
			reve = reve + spl[i];
			
		}
		System.out.println(reve);
	}
	

}
