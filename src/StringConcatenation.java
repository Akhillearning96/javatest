
public class StringConcatenation {

	public static void main(String[] args) {
		String x ="Akhil";
		String y ="Chennuru";
		//String z = x+y;
		//System.out.println(z);
		//String a ="5";
		//String b ="8";
		//System.out.println(a+b);
		int m =6;
		int n = 9;
		System.out.println(m+n+x+y);//15AkhilChennuru
		System.out.println(x+y+m+n);//AkhilChennuru69
		System.out.println(x+y+(m+n));//AkhilChennuru15
		
		char c ='b';
		char d ='Z';
		System.out.println(c+d);//ASCII number of b=98,Z=90
		System.out.println(c+""+d);//bZ
		
		//System.out.println(9/0);//ArithmeticException
		System.out.println(0/9);//0
		//System.out.println(0/0);//ArithmeticException
		System.out.println(0/0.0);//NaN-not a number
		System.out.println(0.0/0);//NaN-not a number
		System.out.println(0.0/0.0);//NaN-not a number
		System.out.println(9/0.0);//Infinity
		System.out.println(5.0/0.0);//Infinity
		
		
		
		//post increment
		int a =275;
		int b=a++;
		System.out.println(a);//276
		System.out.println(b);//275
		
		//pre increment
		int o = 365;
		int q = ++o;
		System.out.println(o);//366
		System.out.println(q);//366
		
		//post decrement 
		int e = 596;
		int f = e--;
		System.out.println(e);//595
		System.out.println(f);//596
		
		//pre decrement 
		int l = 588;
		int p = --l;
		System.out.println(l);//587
		System.out.println(p);//587

	}

}
