package book.hiding;

public class Student {
			
	
	
	int studentID;
	private String StudentName;
	

	int grade;
	String address;
	
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String getName() {
		return StudentName;
	}
	
	public void setStudentName(String pname) {
		StudentName = pname;
	}
	
	
	
	
}
