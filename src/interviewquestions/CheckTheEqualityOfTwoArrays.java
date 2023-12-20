package interviewquestions;



public class CheckTheEqualityOfTwoArrays {

	public static void main(String[] args) {
		//1.Approach 
		int a[] = new int[] {1,2,3,5,4};
		int b[] = new int[] {1,2,3,5,4};
		
//		boolean status = Arrays.equals(a, b);
//		
//		if(status == true) {
//			System.out.println("Arrays are equal");
//		}else {
//			System.out.println("Arrays are not equal");
//		}

		//2.Approach
		boolean status = true;
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					status = false;
					
				}
			}
		}else {
			status = false;
		}
		if(status == true) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}
	}

}
