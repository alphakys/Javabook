package book.inheritance;

public class OverridingTest3 {

	public static void main(String[] args) {
		
		Customer cc = new Customer();
		
		VipCustomer vv = new VipCustomer();
		
		
		Customer vc = new VipCustomer(10030, "나몰라", 2000);
		
		vc.bonusPoint = 1000;
		/////////////////////////////////////////////////////
		
		
		cc.calcPrice(10000);
		
		System.out.println(cc.calcPrice(10000));
		
		
		vv.calcPrice(10000);
		
		System.out.println(vv.calcPrice(10000));
		
		
	
		vc.calcPrice(10000);
	
		System.out.println(vc.calcPrice(10000));
		
		
	}

}
