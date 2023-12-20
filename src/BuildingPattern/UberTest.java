package BuildingPattern;

public class UberTest {

	public static void main(String[] args) {
		UberApp ua = new UberApp();
		((UberApp) ua).signUp();
		//useCase-1
		ua.login()
			.getARide("kavali", "Tirupati")	
				.AddPaymentMethod(500).endRide()
					.doPayment()
						.endRide();
		
		//useCase-2
		ua.loign(5100, 5694)
			.getARide("marthali", "Electronic City")
			 .logout();
		
	}

}
