package book.staticex;

public class Student {
			
	static int serialNum=1000;
	String studentName;
	int grade;
	String address;
	int studentID;
	
	
	Student(String studentName, int grade){
		this.studentName = studentName;
		this.grade = grade;
				
		this.serialNum++;
		studentID=serialNum;
	}
	
	
	
	
	
	
	
	
	
}
