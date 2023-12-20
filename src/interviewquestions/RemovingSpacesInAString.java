package interviewquestions;

public class RemovingSpacesInAString {

	public static void main(String[] args) {
		String ask = "How   was   your   day?";
		ask = ask.replaceAll("\\s", "");
		System.out.println(ask);

	}

}
