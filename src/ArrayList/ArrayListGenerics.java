package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListGenerics {

	public static void main(String[] args) {
		//Generic comes with single type of data
		//Generic is a wrapper class for non-primitive data types
		//object generic is used to store multiple type of data
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(100);
		ar.add(23);
		ar.add(600);
		
		System.out.println(ar.size());
		System.out.println(ar.get(1));
		System.out.println("-----------");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("-----------");
		
		for(Integer e : ar) {
			System.out.println(e);
}
		ArrayList<Integer> ar1 = new ArrayList<Integer>(Arrays.asList(10,20,40,50));
		ArrayList<Integer> ar2 = new ArrayList<Integer>(Arrays.asList(10,20,50,40));
		
//		if(ar2.equals(ar1)) {
//			System.out.println("PASS");
//		}else {
//			System.out.println("FAIL");
//		}
		System.out.println(ar1);
		Collections.sort(ar2);
		System.out.println(ar2);
		
		int i[] = new int[2];
		i[0] = 10;
		i[1] = 20;
		
		System.out.println(Arrays.toString(i));
		
		
		
		
		}

}
