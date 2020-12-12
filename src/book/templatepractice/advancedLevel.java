package book.templatepractice;

public class advancedLevel extends Level {

	@Override
	public void run() {
	System.out.println("빨리 달려");
		
	}

	@Override
	public void jump(int count) {
		for(int i=0;i<count;i++) {
		System.out.println("높이 점프");
		}
	}

	@Override
	public void turn() {
		System.out.println("턴 ㄴㄴ");
		
	}




	
		
	
	
	
}
