package book.singleton;

public class Carfac {
		
	
	
	
	
	private Carfac() {}
	
	private static Carfac instance = new Carfac();
	
	
	
	
	
	
	//////////////////////////////
	
	
	public static Carfac getInstance() {
		
		return instance;
	}
	
	
	
	
	
	
	
	
	
	public Car createCar() {
		Car car = new Car();
		
		return car;
	}
	
	
	
	
	
	
}
