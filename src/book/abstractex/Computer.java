package book.abstractex;

public abstract class Computer {
	

	
	
	public abstract void display();
	
	public abstract void typing() ;
	
	
	public void turnon() {
		System.out.println("전원을 켰어요");	
	}
	
	public void turnoff() {
		System.out.println("전원을 껐어요");	
	}

}
