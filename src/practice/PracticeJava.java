package practice;

public class PracticeJava {
	String name;
	int rollNo;
	String department;
	int weight;
	
	public PracticeJava(String name,int rollNo,String department) {
		this.name = name;
		this.rollNo = rollNo;
		this.department = department;
		System.out.println(name);
		System.out.println(rollNo);
		System.out.println(department);
	}
	
	public static void main(String[] args) {
		
		
		PracticeJava pj = new PracticeJava("Akhil",4432,"Mechanical");
		
		
		
		
		
	}

}
