package book.practice06;

public class Person {
		
	String name;
	int money;
	
	Person (){}
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	
	public void drink(Cafe cafe, Products product) {
		cafe.money+=product.price;
		this.money-=product.price;
		
		
	}
	
	
	public void showPersonInfo() {
		System.out.println(name+"씨가 현재 가진 돈은 "+ money+"입니다.");
	}
	
	
	
	
	
}
