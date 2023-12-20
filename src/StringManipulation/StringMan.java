package StringManipulation;

public class StringMan {

	public static void main(String[] args) {
		String s = "        This is Akhil Chennuru from kavali        ";
		
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(25));
		//System.out.println(s.charAt(78));//StringIndexOutOfBoundsException
		System.out.println(s.indexOf('A'));
		
		String msg = "Welcome Admin";
		if(msg.indexOf("Admin")>0) {
			System.out.println("PASS");
			System.out.println(s.trim());				
		}
		String DoB = "19-11-1996";
		System.out.println(DoB.replace('-', '/'));
		
		//Contains:
		String n = "I am Chennuru Akhil";
		n.contains("Chennuru");
		if(n.contains("Akhil")) {
			System.out.println("PASS");
		}
		else {
			
			System.out.println("FAIL");
		}
		
		//Comparison:
		String t1 ="hello java";//String literals
		String t2 ="hello java";//String literals object created inside the String constant pool(SCP)
		System.out.println(t1==t2);//in this case only checks reference variables only
		System.out.println(t1.equals(t2));//this case it verifies the address also of the hello java
		
		String t3 ="Akhil";
		String t4 ="akhil";
		System.out.println(t3.equalsIgnoreCase(t4));
		
		/*String Constant Pool(SCP):
		 * till jdk1.7 SCP is separate.
		 * but after it is a part of heap memory
		 * String literals is created then object is created inside SCP
		 * Duplicate entry is not allowed inside SCP
		*/
		String t5 = new String("happy birthday");// due to new keyword,object is created inside SCP as well as inside Heap memory separately
		String t6 = "happy birthday";
		String t7 = new String("happy birthday");
		String t8 ="happy birthday";
		System.out.println(t5.equals(t8));
		System.out.println(t5.equals(t6));
		System.out.println(t5.equals(t7));
		
		//split:
		String lan ="JAVA_PYTHON_C_RUBY_PHP";
		
		String lanArr[] = lan.split("_");
		System.out.println(lanArr[0]);
		for(String e : lanArr) {
			System.out.println(e);
		}
		String my = "Akhil;27;kavali;QA;Enginnering";
		String myArr[]= my.split(";");
		for(String e : myArr) {
			System.out.println(e);
		}
				
		//subString:
		
		String token = "Your token number is 1989";
		
		System.out.println(token.substring(10));
		System.out.println(token.substring(token.indexOf("is")+3));
		
		
		}
	}



