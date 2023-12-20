package interviewquestions;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int a[] = new int[] {1,3,4,5};
		int sum = 0;
		int sum1 = 0;
		
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of elements in array :"+ sum);
		
		for(int i=1;i<=5;i++) {
			sum1 = sum1 +i;
		}
		System.out.println("sum of range of elements in array : "+ sum1);
		
		System.out.println("Missing number in array is :" + (sum1-sum));
		

	}

}
