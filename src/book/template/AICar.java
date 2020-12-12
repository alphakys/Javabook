package book.template;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("차가 알아서 방향 전환");
	}

	@Override
	public void stop() {
		
		System.out.println("스스로 멈춥니다.");
		
	}

	@Override
	public void wiper() {
	System.out.println("비나 눈의 양애 따라 빠르기 조절");
		
	}
	
	
	
	
}
