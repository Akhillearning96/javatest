import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		// Map(I)---->HashMap(C)
		//It is order less collection concept.Unsimilar to ArrayList
		
//		HashMap<String,String> hm = new HashMap<String, String>();
		
//		hm.put("ISUZU", "Akhil");
//		hm.put("KIA", "Manikanta");
//		hm.put("Honda", "Dileep");
//		hm.put("Hyundai", "Babu");
//		hm.put(null, "Ford");
//		
//		System.out.println(hm.get("ISUZU"));
//		hm.forEach((k,v)->System.out.println(k+":"+v));
		String user[] = getUserCred("Akhil").split(";");
		
		String un = user[0].trim();
		String pwd = user[1].trim();
		
		doLogin(un, pwd);
		

	}
	public static String getUserCred(String role) {
		HashMap<String , String> cred = new HashMap<String , String>();
		
		cred.put("AKhil","akhil@gmail.com;akhil4432");
		cred.put("Balaji","balaji@gmail.com;balaji123");
		cred.put("Hari","hari@gmail.com;hari456");
		cred.put("Ramana","ramana@gmail.com;ramana789");
		
		return cred.get(role);
	
	}
	public static void doLogin(String un,String pwd) {
		System.out.println("Login details are : " + un + ":"+ pwd);
		
	}

}
