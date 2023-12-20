
public class DataConversion {

	public static void main(String[] args) {
		String x ="100";
		System.out.println(x+20);

		int i = Integer.parseInt(x);
		System.out.println(i+20);
		String y = "100A";
		String k =y.replace('A', '0');
		int j = Integer.parseInt(k);
		System.out.println(j+200);
		
		//int to String 
		
		int m =10;
		String n = String.valueOf(m);
		System.out.println(n+25);
		
	}

}
