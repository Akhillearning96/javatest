package interviewquestions;

public class MaxAndMinValueInArray {

	public static void main(String[] args) {
		int a[] = new int[] {5,6,7,27,23,2};
		int maximum = a[0];
		int minimum = a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>maximum) {
				maximum = a[i];
			}
			if(a[i]<minimum) {
				minimum = a[i];
			}
		}
		System.out.println("Maximum value is :"+maximum);
		System.out.println("Minimum value is : "+ minimum);
		}

}
