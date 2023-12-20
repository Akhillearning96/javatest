package interviewquestions;

public class ReversingString {

	public static void main(String[] args) {
		String  name = "Akhil";
		 
	//1. using concatenation
		
		/*int len = name.length();
		String rev = "";
		for(int i=len-1;i>=0;i--) {
			rev = rev + name.charAt(i);
			
		}*/
		
	//2.using char Array
		/*char n[] = name.toCharArray();
		String rev ="";
		for(int i= n.length-1;i>=0;i--) {
			rev = rev + n[i];
		}*/
		
	//3.using string buffer
		StringBuffer sb = new StringBuffer(name);
		StringBuffer rev = sb.reverse();
 		
		System.out.println("Reverse name is :" + rev);
		

	}

}
