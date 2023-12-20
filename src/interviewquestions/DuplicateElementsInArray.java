package interviewquestions;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		String lang[] = new String[] {"java","python","ruby","php","c#"};
		//Approach -1
//		
//		for(int i=0;i<lang.length;i++) {
//			for(int j=i+1;j<lang.length;j++) {
//				if(lang[i].equals(lang[j])) {
//					
//					System.out.println("Duplicate element is :" +lang[i]);
//					
//					
//				}
//			}
//		}
		//Approach - 2 HashSet
		boolean flag = false;
		HashSet<String> langs = new HashSet<String>();
		
		for(String e : lang) {
			if(langs.add(e)== false) {
				System.out.println(e+" is a duplicate language in array");
				flag = true;
				
			}
		}
		if(flag== false) {
			System.out.println("No Duplicate elements in array");
		}
		
	}

}
