package book.interfaceex;

public class CalcTest {

	public static void main(String[] args) {
		int num1 = 10;
		
		int num2 = 20;
		
		CompleteCalc c = new CompleteCalc();
		
		
		//Calculator,,Calc,,CompleteCalc
		System.out.println(c.add(num1, num2));
		System.out.println(c.substract(num1, num2));
		
		System.out.println(c.times(num1, num2));
		System.out.println(c.add(num1, num2));
		c.showInfo();
		System.out.println(c.square(num1));
		
		c.description();
		
		int[] arr = {1,2,3,4,5};
		
		
		System.out.println(Calc.total(arr));
		
		
	
	}

}
