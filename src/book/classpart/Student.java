package book.classpart;

public class Student {
		
	int studentID;
	String studentName;
	int grade;
	String address = "신림";
	
	
	
	
	
	
	public void setStudentName(String name) {
		
		studentName = name;
	}
	
	
	int add(int n1, int n2) {
		
		int result = n1 + n2;
		
		return result;
	}
	
	
	
	 String getStName() {
		return studentName;
	}
	
	
	
	void showStudenInfo() {
		System.out.println(studentName+","+address);
	}
		void showStInfo() {
			System.out.println(studentName + address);
			int n1 = 100;
		}
		
		public static void main(String[] args) {
			
			Student st = new Student();
			
			st.setStudentName("강용수");
			
			
			System.out.println(st.studentName);
			System.out.println(st.getStName());
			
			
			
			
		}
		
	
	
	
}
