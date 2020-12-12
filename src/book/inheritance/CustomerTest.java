package book.inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Customer Lee = new Customer();
		Lee.name = "이순신";
		Lee.customerID = 10010;
		Lee.bonusPoint = 1000;
		
		System.out.println(Lee.showCusInfo());
		System.out.println("===============================");
		VipCustomer Kim = new VipCustomer();
		Kim.name = "김유신";
		Kim.customerID = 10020;
		Kim.bonusPoint = 10000;
		
		System.out.println(Kim.showCusInfo());
		
		
		Customer vc = new VipCustomer();
		
		
		
		
	}

}
