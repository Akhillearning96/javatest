

public class ReeverseString {

	public static void main(String[] args) {
		int p = 4;
		int count = 0;
		if(p>1) {
			for(int i=1;i<=p;i++) {
				if(p%i==0) {
					count++;
					
				}
			}
			if(count>2) {
				System.out.println("it is not a prime number");
			}else {
				System.out.println("It is a prime number");
			}
		}
		else {
			System.out.println("It is not a prime number");
		}
		
	}

}
