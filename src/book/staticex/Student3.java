package book.staticex;

public class Student3 {
			
	private static int serialNum=1000;
	int studentID;
	int studentCard;
	
	
	
	String studentName;
	int grade;
	String address;
	
	///////////////////////////////////////////
	
public Student3() {
	serialNum++;
	studentID=serialNum;
	studentCard=studentID+100;
}
	
	
	
	
	
	
	
	
	public static int getSerialNum() {
		return serialNum;
		//int i=10;
	}
	
	
	
	public String getStudentName() {
		return studentName;
	}








	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}








	public static void setSerialNum(int serialNum) {
		Student3.serialNum = serialNum;
	}








	public int getGrade() {
		return grade;
	}








	public void setGrade(int grade) {
		this.grade = grade;
	}








	public String getAddress() {
		return address;
	}








	public void setAddress(String address) {
		this.address = address;
	}








	public int getStudentID() {
		return studentID;
	}








	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	
	
	
	
	
	
	
	
}
