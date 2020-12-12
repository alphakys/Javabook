package book.staticex;

public class Student2 {
			
	private static int serialNum=1000;
	String studentName;
	int grade;
	String address;
	int studentID;
	
	///////////////////////////////////////////
	
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
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
		Student2.serialNum = serialNum;
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
