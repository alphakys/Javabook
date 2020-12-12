package book.cooperation;

public class Subway {
			
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
		
	}
	
	
	public void take(int money) {
		passengerCount++;
		this.money+=money;
	}
	
	
	public void subwayInfo() {
		System.out.println("이 지하철은 "+lineNumber+"이고 이 지하철의 승객은"+passengerCount+"명 입니다 그리고 수입은 "+money);
	}
	
	
	
}
