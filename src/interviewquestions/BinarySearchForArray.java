package interviewquestions;

import java.util.Arrays;

public class BinarySearchForArray {

	public static void main(String[] args) {
		int arr[] = new int[] {10,20,30,40,50,60,70,80,90};
		//Approach-1
		//PreConditon - Array should be in sorted order
		boolean flag = false;
//		int key = 200;
//		
//		int l = 0;
//		int h = arr.length-1;
//		
//		
//		while(l<h) {
//			int m = (l+h)/2;
//			if(arr[m]==key) {
//				
//				System.out.println(m +" is the index of key and key available in the array");
//				flag = true;
//				break;
//			}
//			if(arr[m]<key) {
//				l=m+1;
//				
//			}
//			if(arr[m]>key) {
//				h=m-1;
//			}
//		}
//		if(flag == false) {
//			System.out.println("key is not present in the array");
//		}
		//Approach-2
		int indexOfNum = Arrays.binarySearch(arr, 10);
		
		if(indexOfNum>=0) {
			System.out.println("Number is present at index :" + indexOfNum);
			
		}else {
			System.out.println("Number is not present");
			
		}
		
	}

}
