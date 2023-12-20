package InterfaceAssignment;

public interface UKEducation extends GlobalEdu {
	
	public void gradingSystem();
	
	public void syllabus();
	
	public static void integrated() {
		
		System.out.println("integrated");
	}
	
	default void comeon() {
		
		System.out.println("default method");
	}
	
	

}
