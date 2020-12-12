package book.practice09;

public abstract class Car {
	
	
	
	public abstract void start();
	
	public abstract void dirve();
	
	public abstract void stop();
	
	public abstract void turnoff();
	
	public void WashCar() {
		System.out.println("세차를 합니다.");
	}
	
	
	public final void run() {
		
		start();
		dirve();
		stop();
		turnoff();
		WashCar();
	}
	
	
}
