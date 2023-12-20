package interviewquestions;


public class PalindromeNumber {

	public static void main(String[] args) {
		
		//PalindromeNumber.isPalindromeNumber(236);
		printPalindromeNumber(100,1000);
	
	}
	public static boolean isPalindromeNumber(int num) {
		
		 int org_num = num;
		int rev =0;
		while(num!=0) {
			rev = rev*10 + num%10;
			num =num/10;
		}
		if(org_num==rev) {
			System.out.println(org_num + " is a palindrome number");
			return true;
		}//else {
			//System.out.println(org_num+" is not a palindrome number");
				//}
			return false;
		
	}
	public static void printPalindromeNumber(int num1 , int num2) {
		for(int i = num1;i<=num2;i++) {
			if(isPalindromeNumber(i)) {
				
			}
		}
	}

}
