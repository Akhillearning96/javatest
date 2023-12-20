package interviewquestions;

public class PrintEvenorOddFromArray {

	public static void main(String[] args) {
		int a[] = new int[] {2,3,4,8,9,22};
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evenCount++;
				//System.out.println("The number is even number :"+ a[i]);
			}else {
				oddCount++;
				
			}
			
		}
		System.out.println(evenCount);
		System.out.println(oddCount);
				
	}

}
