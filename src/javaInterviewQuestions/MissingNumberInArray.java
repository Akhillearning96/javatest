package javaInterviewQuestions;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int miss[] = {1,2,4,6};
		int sum =0;
		for(int i=0;i<miss.length;i++) {
			sum = sum + miss[i];
			
		}
		System.out.println(sum);
		
		int sum1 = 0;
		for(int j=0;j<miss.length+1;j++) {
			sum1 =sum1 + j;
		}
		System.out.println(sum1);
		
		System.out.println(sum-sum1);
	}
	

}
