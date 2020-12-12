package book.cooperation;

public class Taxi {
			
	int money;
    int passengerCount;
	int taxiNumber;
	
	 Taxi(){}
	
	 Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	
	
	
	public void take() {
		this.money+=10000;
	}
	
	public void showInfo() {
		System.out.println("현재 "+passengerCount+"명의 승객이 타고 있고 현재 "+money+"의 돈을 벌었습니다.");
	}
	
	
	
}
