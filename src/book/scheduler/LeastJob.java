package book.scheduler;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
				System.out.println("상담 전화 순서대로 대기열서 가져와");		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("대기열이 가장 적은 사원에게 배분");
		
	}

}
