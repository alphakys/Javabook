package book.classpart;

public class FunctionTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		
		Person P = new Person();
		
		
		
		int sum = P.add(num1,num2);
		System.out.println(sum);
		
		
		
	}

					public static int add(int n1,int n2) {
						int result = n1+n2;
						
						return result;
					}
	
					public static int mutilply(int n1,int n2) {
						int result = n1*n2;
						
						return result;
					}
					
					public static void divide(int n1,int n2) {
						
						if(n2==0) {
							System.out.println("나눌수 없습니다");
							return;
									}
						else {
							int result = n1/n2;
							System.out.println(result);
						}
						
					}
					
					
					public static int subtraction(int n1,int n2) {
						int result = n1-n2;
						
						return result;
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
	
}
