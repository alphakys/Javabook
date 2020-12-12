package book.scheduler;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("roundRobin");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("roundRobin");
		
	}

	
	
	
	
	
		
}
