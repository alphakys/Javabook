package book.practice06;

public class Cafe {
	
	
	String name;
	int customer;
	int money;
	
	
	public Cafe(String name) {
		this.name = name;
		
	}
	

	
	
	public void showCafeInfo() {
		System.out.println("현재 매출은 "+money+"이고 가게 안 손님은 "+customer+"입니다.");
	}
	
	
	
	
	
}


class Products{
	
	String name;
	int price;
	
	
	Products (){}
	
	Products (String name, int price){
		this.name = name;
		this.price = price;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}





