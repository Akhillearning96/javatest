package interviewquestions;

import java.util.Random;

public class RandomNumberGeneration {

	public static void main(String[] args) {
		//1.Approach - Random Number Generation
		Random r = new Random();
		
		int num = r.nextInt(10);
		System.out.println(num);
		
		//2.Approach - using Math class
		
		System.out.println(Math.random());
		

	}

}
