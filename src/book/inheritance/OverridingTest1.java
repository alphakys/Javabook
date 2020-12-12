package book.inheritance;

public class OverridingTest1 {

	public static void main(String[] args) {
		
		
		Customer Lee = new Customer(10010,"이순신");
		
		Lee.bonusPoint = 1000;
		
		VipCustomer Kim = new VipCustomer(10020,"김유신",1);
		
		Kim.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(Lee.getName()+"님이 지불해야 하는 금액은 "+ Lee.calcPrice(price)+"원입니다.");
		
		System.out.println(Kim.getName()+"님이 지불해야 하는 금액은 "+ Kim.calcPrice(price)+"원입니다.");
		
		
		
		
		
	}

}
