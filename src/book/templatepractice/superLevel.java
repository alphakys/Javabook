package book.templatepractice;

public class superLevel extends Level {

	@Override
	public void run() {
		System.out.println("매우 빨리 달려");
		
	}

	

	@Override
	public void turn() {
		System.out.println("매우 빨리 턴해여");
		
	}

	@Override
	public void jump(int count) {
		for(int i=0;i<count;i++) {
			System.out.println("매우 높이 점프");
			}
		
	}
			
}
