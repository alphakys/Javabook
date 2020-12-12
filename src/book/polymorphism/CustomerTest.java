package book.polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
			
		Customer Lee = new Customer();
		Lee.customerID = 10010;
		Lee.name = "이순신";
		Lee.bonusPoint = 1000;
		
		System.out.println(Lee.showCusInfo());
		
		
		Customer Kim = new VipCustomer(10020,"김유신",12345);
		Kim.bonusPoint = 1000;
		
		System.out.println(Kim.showCusInfo());
		
		
		System.out.println("========할인율과 보너스 포인트 계산=====");
		
		
		
		int price = 10000;
		
		
		System.out.println(Lee.calcPrice(price));
		System.out.println(Lee.showCusInfo());
		
		System.out.println(Kim.calcPrice(price));
		System.out.println(Kim.showCusInfo());
		
		
		
		
		
	}

}
