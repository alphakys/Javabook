package book.classpart;

public class 연습장 {
	
	int studentID;
	String name;
	int grade;
	String address;
	
	
	public void getStudentInfo() {
		System.out.println(studentID+","+name+","+grade+","+address);
	}
	
	public String getName(){
		return name;
	}
	
	public int getGrade() {
		return grade;
		
	}
	
	public void setStudentName(String pname) {
		name = pname;
	}
	
	
	
	public void setGrade(int pgrade) {
		grade = pgrade;
	}
	
	
	public int add(int num1, int num2) {
			int result = num1 + num2;
			
			return result;
		}
	
	public void divide(int num1, int num2) {
		if(num2==0) {
			System.out.println("나눌 수 없습니다");
			return;
		}
		else {
			int result = num1/num2;
			System.out.println(result);
		}
		
		
		
	}
	
	
	public int subtraction(int num1, int num2) {
		int result = num1 - num2;
		
		return result;
	}
	public int multiply(int num1, int num2) {
		int result = num1*num2;
		
		return result;
	}
	public static void main(String[] args) {

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
