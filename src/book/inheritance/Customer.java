package book.inheritance;

public class Customer {
	
	
	protected int customerID;
	protected String name;
	protected String grade;
	 		int bonusPoint;
	 		double bonusRatio;
	 		
	public Customer(int customerID, String name ) {
		
		this.name = name;
		this.customerID = customerID;
		grade = "SILVER";
		bonusRatio = 0.01;
		
	}
	
	public Customer(){}
	
	
	
	public int getCustomerID() {
		return customerID;
	}








	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}








	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getGrade() {
		return grade;
	}




	public void setGrade(String grade) {
		this.grade = grade;
	}





	public int calcPrice(int price) {
		bonusPoint+=(price*bonusRatio);
		return price;
	}
	
	
	public String showCusInfo() {
		
		return name+"님의 등급은 "+grade+"이며, 보너스 포인트는 "+ bonusPoint +"입니다.";
	}
	
	
	
	
	
	 		
	
}
