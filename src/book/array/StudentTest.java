package book.array;

public class StudentTest {

	public static void main(String[] args) {

		Student1 stLee = new Student1("Lee");
		
		Student1 stKim = new Student1("Kim");
		
		//System.out.println(stKim.toString());
		/*		
		stLee.subjects.add(new Subject("국어",100));
		stLee.subjects.add(new Subject("수학",50));		
		
		stKim.subjects.add(new Subject("국어",70));
		stKim.subjects.add(new Subject("수학",85));	
		stKim.subjects.add(new Subject("영어",100));
		
		*/
		
		stLee.addSubject("국어",100);
		stLee.addSubject("수학",85);
		
		
		stLee.showStudentInfo();
		System.out.println("===========================");
		stKim.showStudentInfo();
		
		
	}

}
