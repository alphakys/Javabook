package book.polymorphism;

public class GoldCustomer extends Customer{
	
	double saleRatio;
	
	public GoldCustomer() {}
	
	public GoldCustomer(int CustomerID, String name) {
		super(CustomerID, name);
		grade = "GOLD";
		saleRatio = 0.1;
		bonusRatio = 0.02;
		
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint+=(price*bonusRatio);
		return price - (int)(price*saleRatio);
	}
	
	
	
	
	
	
	
}
