package book.polymorphism;

import java.util.ArrayList;

public class CustomerTest2 {

	public static void main(String[] args) {
		/*	
		Customer Lee = new Customer();
		Lee.customerID = 10010;
		Lee.name = "이순신";
		Lee.bonusPoint = 1000;
		
		Customer Kang = new Customer(10020,"강용수");
		Kang.bonusPoint = 1000;
		
	
		
		GoldCustomer Kim = new GoldCustomer(10030,"김유신");
		Kim.bonusPoint = 1000;
		
		
		
		GoldCustomer Park = new GoldCustomer(10040,"박세준");
		Park.bonusPoint = 1000;
		
		
		
		VipCustomer KangC = new VipCustomer(10050,"강철",1);
		KangC.bonusPoint = 1000;
		
		*/
		
		ArrayList<Customer> ArrC = new ArrayList<Customer>();
		
		ArrC.add(new Customer(10010, "이순신"));
		ArrC.add(new Customer(10020, "김유신"));
		ArrC.add(new GoldCustomer(10030, "강용수"));
		ArrC.add(new GoldCustomer(10040, "박세준"));
		ArrC.add(new VipCustomer(10050, "조성래",1));
		
		
		for(Customer c : ArrC) {
			
			System.out.println(c.showCusInfo());
		}
		
		
		
		System.out.println("========할인율과 보너스 포인트 계산=====");
		
		
	
		int price = 10000;
		
		for(Customer c : ArrC) {
			
			System.out.println(c.name+"님의 지불금은 "+c.calcPrice(price)+"입니다.");
		}
		
		
		
	}

}
