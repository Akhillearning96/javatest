package BuildingPattern;

public class UberApp {
	public void signUp() {
		System.out.println("Sign up to create rider account");
	}
	
	public UberApp login() {
		System.out.println("default login");
		return this;
	}
	public UberApp loign(String emailid,int otp) {
		System.out.println("login with :" + emailid +":"+ otp);
		return this;
	}
	public UberApp loign(long phoneno,int otp) {
		System.out.println("login with :" + phoneno +":"+ otp);
		return this;
	}
	public UberApp getARide(String pickUpLocation,String dropOffLocation) {
		System.out.println("Please enter the start and end point :" + pickUpLocation + " :"+ dropOffLocation );
		return this;
		
	}
	
	public UberApp AddPaymentMethod(String Paytm,int otp) {
		System.out.println("payment method :" + Paytm);
		return this;
		
	}
	public UberApp AddPaymentMethod(int cash ) {
		System.out.println("payment method :" + cash);
		return this;
		
	}
	public UberApp AddPaymentMethod(String giftCard ) {
		System.out.println("payment method :" + giftCard);
		return this;
		
	}
	public UberApp requestRide() {
		System.out.println("Request Ride");
		return this;
	}
	public UberApp startRide() {
		System.out.println("start the ride");
		return this;
	}
	public UberApp endRide() {
		System.out.println("end the ride");
		return this;
	}
	public UberApp doPayment() {
		System.out.println("Do payment");
		return this;
	}
	public UberApp rideCompleted() {
		System.out.println("ride completed successfully");
		return this;
	}
	public UberApp logout() {
		System.out.println("Logout from uber app");
		return this;
	}

	


}
