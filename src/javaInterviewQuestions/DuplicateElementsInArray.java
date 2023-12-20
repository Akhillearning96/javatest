package javaInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		String lang[] = {"java","python","Ruby","PHP","C","C#","java"};
		//1.Approach
		for(int i=0;i<lang.length;i++) {
			for(int j=i+1;j<lang.length;j++) {
				if(lang[i].equals(lang[j])) {
					System.out.println("Duplicate entry is :"+ lang[i]);
					
				}
				
			}
		}
 	

	//2.Approach : Using HashSet : it store only Unique Values
	
	Set<String> store = new HashSet<String>();
	for(String e : lang) {
		if(store.add(e)==false) {
			System.out.println("duplicate element is :" + e);
		}
		
	}
	
	
}
}

