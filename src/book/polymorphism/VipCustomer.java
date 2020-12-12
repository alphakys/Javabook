package book.polymorphism;

public class VipCustomer extends Customer {
	
	
	double saleRatio;
	private int agentID;

	 
	 
	 
	 /////////////////////////////////////////////////////	
	
	public VipCustomer(){}
	
	public VipCustomer(int customerID, String name , int agentID) {
		
		super(customerID,name);
		this.agentID = agentID;
		initVipCustomer();
		
	}
	

	
	public int getAgentID() {
		
		return agentID;
		
	}
	
	
	
	
	
	
	///////////////////////////////////////////////////////
	
	private void initVipCustomer(){
		
		grade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	
	
	
	@Override
	public String showCusInfo() {
		// TODO Auto-generated method stub
		return super.showCusInfo() +" 당당 상담원 아이디는 "+agentID+"입니다.";
	}

	
	
	
	
	

		
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint+=(price*bonusRatio);
		return price - (int)(price*saleRatio);
	}

	
	
	
	
	
	

	
	
	
	
}
