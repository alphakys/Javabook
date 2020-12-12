package book.inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		
		
		Customer vc = new VipCustomer(10030, "나몰라", 2000);
		
		vc.bonusPoint = 1000;
		
	
		vc.calcPrice(10000);
	
		System.out.println(vc.calcPrice(10000));
		
		
	}

}
