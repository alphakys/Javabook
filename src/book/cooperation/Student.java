package book.cooperation;

public class Student {
	
	public String studentName;
	public int grade;
	public int money;
	
	public Student (String studentName, int money){
		this.studentName = studentName;
		this.money = money;
	}
	
	
	//학생이 버스를 타면 1000원을 지불하는 기능을 구현하는 메서드
	
	
	public void takeBus(Bus bus) {
		this.money-=1000;
		bus.money+=1000;
		
	}
	
	
	public void takeSubway(Subway subway) {
		this.money-=1500;
		subway.money+=1500;
		
	}
	
	
	
}
