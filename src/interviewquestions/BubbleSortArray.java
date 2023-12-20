package interviewquestions;

import java.util.Arrays;

public class BubbleSortArray {
	public static void main(String[] args) {
		int arr[] = new int[] {1,5,3,2,6};
		
		System.out.println("Array before sorting :" + Arrays.toString(arr));
		int leng = arr.length;
		for(int i=0;i<leng-1;i++) {//this loop for n-1 passes
			for(int j=0;j<leng-1;j++) {//this loop for swamping position with comparison between two
				
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		//Arrays.sort(arr);
		
		System.out.println( "Arrays after sorting" + Arrays.toString(arr));
		
	}

}
