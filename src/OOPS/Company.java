package OOPS;

public class Company {
	public String name;
	public int sharePrice;
	public String hq;
	
	
	public int getSharePrice() {
		return sharePrice;
	}


	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}


	public static void main(String[] args) {
		Company c = new Company();
		c.name = "Akhil";
		c.sharePrice = 1000;
		c.hq ="Hyderabad";
		
		System.out.println(c.name +":" + c.sharePrice+":"+ c.hq);
		
	}

}
