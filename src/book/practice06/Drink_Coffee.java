package book.practice06;

public class Drink_Coffee {

	public static void main(String[] args) {
					
		Person Kim = new Person("김씨", 50000);
		
		Person Lee = new Person("이씨", 100000);
		
		Cafe cafeStar = new Cafe("스타벅스");
		
		Cafe cafeBean = new Cafe("콩다방");
		
		Products americano = new Products("아메리카노",4000);
		Products latte = new Products("라떼",4500);
		
		
		
		
		Kim.drink(cafeStar, americano);
		Kim.showPersonInfo();
		cafeStar.showCafeInfo();
		
		
		Lee.drink(cafeBean, latte);
		Lee.showPersonInfo();
		cafeBean.showCafeInfo();
		
		
		
		
		
		
		
		
		
		
	}

}
