package book.inheritance;

public class VipCustomer extends Customer {
	
	
	double saleRatio=0.1;
	 int agentID;

	 
	 
	 
	 /////////////////////////////////////////////////////	
	
	public VipCustomer(){}
	
	public VipCustomer(int customerID, String name , int bonusPoint) {
		
		super(customerID,name);
		this.bonusPoint = bonusPoint;
		grade = "VIP";
		bonusRatio = 0.05;
		
	}
	

	
	public int getAgentID() {
		
		return agentID;
		
	}
	
	
	
	
	
	
	///////////////////////////////////////////////////////
	
	public String showVipInfo() {
		return super.showCusInfo()+ " 당당 상담원 아이디는 "+agentID+"입니다.";
	}
	
	
	
	
	

		
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint+=(price*bonusRatio);
		return price - (int)(price*saleRatio);
	}

	
	
	
	
	
	

	
	
	
	
}
