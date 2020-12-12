package book.array;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {

		
		
		ArrayList<Student> st = new ArrayList<Student>();
		
		
		
		st.add(new Student(1001,"james"));
		st.add(new Student(1002,"edward"));
		st.add(new Student(1003,"tomas"));
		
		
		for(Student stShow : st) {
			stShow.showStudentInfo();
		}
		
		
		for(int i=0;i<st.size();i++) {
			
			Student stShow = st.get(i);
			
			stShow.showStudentInfo();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
