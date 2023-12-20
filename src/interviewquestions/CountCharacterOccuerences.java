package interviewquestions;

public class CountCharacterOccuerences {

	public static void main(String[] args) {
		int countNum = OccurenceCount('J');
		System.out.println(countNum);
		
		//.Approach-2
		/*
		 *By finding actual length of the string 
		 *Then after replacing the character we want count with empty and removing that character
		 *finding the length of the string and getting the length difference before and after removal of that
		 *character will provide the occurrence of that character
		 * 
		 * 
		 */
		
	}
	
	public static int OccurenceCount(char character) {
		String s = "Java Programming Java oops";
		char  arr[]= s.toCharArray();
		
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]== character) {
				count++;
			}
		}
		System.out.println("Occurence of a in above string is :");
		return count;
	}
	}


