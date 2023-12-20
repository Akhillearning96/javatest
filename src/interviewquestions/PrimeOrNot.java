package interviewquestions;

public class PrimeOrNot {

	public static void main(String[] args) {
		//isPrimeNumber(75);
		
		printPrimeNumbers(50);
	}
//	public static  void isPrimeNumber(int num) {
//		int count = 0;
//		if(num>1) {
//			for(int i=1;i<=num;i++) {
//				if(num%i==0) {
//					count++;
//				}
//			}
//			if(count>2) {
//				System.out.println("it is not a prime number ");
//			}else {
//				System.out.println("it is a prime number");
//			}
//		}else{
//			System.out.println("it is not a prime number");
//		}
//	}
	
	
	public static boolean isPrimeOrNot(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	
	}
	public static void printPrimeNumbers(int uptoNum) {
		for(int i=2;i<=uptoNum;i++) {
			if(isPrimeOrNot(i)) {
				System.out.print(" " +i);
			}
		}
	}

}
