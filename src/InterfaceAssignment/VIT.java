package InterfaceAssignment;

public class VIT extends Education implements USEducation,IndianEducation, UKEducation{

	@Override
	public void globalStandard() {
		System.out.println("IIT--globalStandard");
		
	}

	@Override
	public void educationInstructions() {
		System.out.println("IIT--educationInstructions");
		
	}

	@Override
	public void gradingSystem() {
		System.out.println("IIT--gradingSystem");
		
	}

	@Override
	public void syllabus() {
		System.out.println("IIT--syllabus");
		
	}

	@Override
	public void multiLangEducation() {
		System.out.println("IIT--multiLangEducation");
		
	}

	@Override
	public void typesOfEducation() {
		System.out.println("IIT--typesOfEducation");
		
	}

	@Override
	public void langForEducation() {
		System.out.println("IIT--langForEducation");
		
	}

	@Override
	public void schoolEducation() {
		System.out.println("IIT--schoolEducation");
		
	}

	@Override
	public void collegeEducation() {
		System.out.println("IIT--collegeEducation");
		
	}
	
}
