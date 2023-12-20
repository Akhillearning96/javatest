package interviewquestions;

public class SumOfElementsOfArray {

	public static void main(String[] args) {
		int a[] = new int[]{5,4,3,2,20};
		int sum =0;
		
		for(int i=0;i<a.length;i++) {
			
			sum = sum + a[i];
			
		}
		System.out.println("sum of array is :"+sum);
		

	}

}
