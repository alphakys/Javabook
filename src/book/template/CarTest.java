package book.template;

public class CarTest {

	public static void main(String[] args) {
		
		System.out.println("==자율 주행하는 차==");
		Car myCar = new AICar();
		
		myCar.run();
		
		System.out.println("==일반적인 차==");
		Car hisCar = new ManualCar();
		
		hisCar.run();
		
		
	
		
	}

}
