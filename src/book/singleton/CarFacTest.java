package book.singleton;

public class CarFacTest {

	public static void main(String[] args) {
		
		
		Carfac factory = Carfac.getInstance();
		
		Car my = factory.createCar();
		Car you = factory.createCar();
		
		System.out.println(my.getCarNum());
		System.out.println(you.getCarNum());
		
		
		
		
		
		
		
		
		
	}

}
