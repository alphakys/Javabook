package book.scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("전화 상담 할당 방식");
		System.out.println("R : 한명씩 차례로 할당");
		System.out.println("L : 대기열 적은 직원 할당");
		System.out.println("P : 일 잘하는 직원 먼저 할당");
		System.out.println("A : 상담원 전화 알아서 가져가");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if(ch =='R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if(ch =='L' || ch == 'l') {
			scheduler = new LeastJob();
		}
		else if(ch =='P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else if(ch =='A' || ch == 'a') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("지원되지 않는 기능입니다.");
		}
		
		
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
		
		
		
		
	}

}
