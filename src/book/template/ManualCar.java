package book.template;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전");
		System.out.println("사람이 핸들조작");
	}

	@Override
	public void stop() {
		System.out.println("브레이크 밝아요");
		
	}

	@Override
	public void wiper() {
		System.out.println("사람이 빠르기 조절");
		
	}
	
	
	
	
	
	
	
}
