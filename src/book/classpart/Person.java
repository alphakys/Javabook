package book.classpart;

public class Person {
			
	
	
	
				char gender;
				int age;
				double weight;
				double height;
				String name;
				int money;
				boolean married;
				
				Student address;
				Student kys;
				
				int add(int num1,int num2) {
					int result = num1 + num2;
					return result;
					
				}
				
				
				int getTen() {
					int sum=0;
					for(int i=1; i<=10;i++) {
						
						sum+=i;
					}
					return sum;
					
					
				}
				
				
				
				void printGreeting(String name) {
					
					System.out.println(name+"님 안녕하세요");
				}
				
				
				void divide(int num1, int num2) {
					if(num2==0) {
						System.out.println("계산할 수 없습니다.");
						return;
					}
					else {
						System.out.println(num1/num2);
					}
					
					
				}
				
				
				
				
				public static void main(String[] args) {
					
					
					Student st = new Student();
					
					st.showStudenInfo();
					
					
					
					String s1 = "hello";
					String s2 = "hello"	;	
					String s3 = s2;
					String s4 = new String("hello"); // 생성자를 통해 만들어진 변수들은 각각의 메모리를 가진다
					String s5 = new String("you hoo"); // 생성자를 통해 만들어진 변수들은 각각의 메모리를 가진다
					
					
					
					
					String s6 = new String("그렇구만");
					String s7 = new String("rmfotdj");
					System.out.println();
					
					
					if(s4.equals(s5)) {
						System.out.println(2); //이것은 주소를 비교하는 것에 불과하다
					}
					
					else {
						System.out.println(1);
					}
				
				
				String str = "abc";
				
				char data[] = {'a','b','c'};
				
				String str1 = new String(data);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				}
}
