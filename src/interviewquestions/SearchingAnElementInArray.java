package interviewquestions;

public class SearchingAnElementInArray {

	public static void main(String[] args) {
		int a[] = new int[] {10,20,30,40,50};
		int search_ele = 30;
		boolean flag = false;
		for(int i=0;i<a.length;i++) {
			if(search_ele==a[i]) {
				System.out.println("The number is located at :" +i);
				flag = true;
				break;
				
			}
		}
		if(flag == false) {
			System.out.println("Number is not present in this array");
			
		}

	}

}
