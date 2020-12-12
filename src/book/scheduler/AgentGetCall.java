package book.scheduler;

public class AgentGetCall implements Scheduler{

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("상담원 다음 전화 요청");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("상담원 다음 전화 가져감");		
	}
	
	
	
	
	
}
