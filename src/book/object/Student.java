package book.object;

public class Student {
		
	String name;
	int studentID;
	
	public Student(String name, int studentID) {
		this.name = name;
		this.studentID = studentID;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

*/




	@Override
	public int hashCode() {
		
		return studentID;
	}












	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public boolean equals1(Object obj) {
		
		if(obj instanceof Student) {
			Student s = (Student)obj;
			if(this.name == s.name ) {
				return true;
			}
			else {
				return false;
			}
		}
			else {
				return false;
			}
		}
		
		
		
	




	public static void main(String[] args) {
		
		Student st = new Student("k",100);
		
		Student st1 = new Student("k",100);
		
		System.out.println(st.hashCode());
		System.out.println(st1.hashCode());
		
		System.out.println(st.equals(st1));
		
		System.out.println(System.identityHashCode(st));
		System.out.println(System.identityHashCode(st1));
		
		System.out.println(System.identityHashCode(st));
		
		
		
		
	}
}
