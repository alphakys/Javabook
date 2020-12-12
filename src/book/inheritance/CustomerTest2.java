package book.inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		
		
		VipCustomer Kim = new VipCustomer(10100,"김유신",2000);
		
		Kim.agentID = 2;
		
		
		System.out.println(Kim.showVipInfo());
		
		
	}

}
