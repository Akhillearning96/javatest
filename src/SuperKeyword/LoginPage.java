package SuperKeyword;

public class LoginPage extends page{
	int timeOut = 200;

	public LoginPage() {
		super();
	}
	
	public void loginPageDisplay() {
		System.out.println(timeOut);
		System.out.println(super.timeOut);
	}
	@Override
	public void pageMethod() {
		System.out.println("lp page method");
		super.pageMethod();
		
	}

}
