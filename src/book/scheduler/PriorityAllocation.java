package book.scheduler;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객의 전화 가져와");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 스킬이 높은 상담원");
		
	}
	
}
