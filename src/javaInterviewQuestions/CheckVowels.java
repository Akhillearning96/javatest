package javaInterviewQuestions;

	public class CheckVowels {
	
		public static void main(String[] args) {
			String text = "AEIOU";
			String text1 = text.toLowerCase();
			
			int count =0;
			String s ="";
			
			for(int i=0;i<text1.length();i++) {
				char  c = text1.charAt(i);
				if(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u') {
					count++;
					s =s + c;
					
				}
				
				
			}
			System.out.println(s);
			System.out.println(count);
	
		}
	
	}
