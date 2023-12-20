package interviewquestions;

import java.util.Arrays;
import java.util.Collections;

public class SortingArrayWithBuiltMethods {

	public static void main(String[] args) {
		
		Integer a[] = {10,20,50,40,30};
		System.out.println("Array element before sorting :" + Arrays.toString(a) );
		//Approach-1
//		Arrays.parallelSort(a);
//		System.out.println("Array element after sorting :" + Arrays.toString(a));
		
		//Approach - 2
//		Arrays.sort(a);
//		System.out.println("Array element after sorting :" + Arrays.toString(a));
		
		//Approach - 3(to print descending order)
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array element after sorting :" + Arrays.toString(a));
		
	}

}
