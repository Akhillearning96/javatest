package javaInterviewQuestions;

public class RemovingJunkCharctersFromString {

	public static void main(String[] args) {
		String name = "的是Akhil	人*****####chennuru的32";
		
	String text = name.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(text);
	}

}
