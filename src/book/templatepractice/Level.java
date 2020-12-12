package book.templatepractice;

public abstract class Level {
	
	
	
	public abstract void run();
	
	
	public abstract void jump(int count);
	
	
	public abstract void turn();
	
	final public void go(int count) {
			run();
			jump(count);
			turn();
	}
	
	
}
