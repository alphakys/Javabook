package book.interfaceex;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int divide(int num1, int num2) {
	
		if(num2 != 0) {
		return num1/num2;
		}
		else {
			return ERROR;
		}
		
	}
	
	public void showInfo() {
		System.out.println("Cal 인터페이스를 구현하였습니다.");
	}
	
	public static void main(String[] args) {
		
		CompleteCalc c = new CompleteCalc();
		
		System.out.println(c.divide(3, 4));
	}

	@Override
	public int square(int num) {
		
		return (int)Math.pow(num, 2);
	}
	
	
	
	
	
	
	
	
}
