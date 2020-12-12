package book.array;

import java.util.ArrayList;

public class Student1 {
			
	private int ID;
	private static int serialNum = 1000;
	private String name;
	ArrayList<Subject> subjects;
	
	
	
	//ArrayList<Subject> subjects = new ArrayList<Subject>();
	
	
	Student1(){}
	
	public Student1(String name){
		this.name = name;
		serialNum++;
		ID=serialNum;
		subjects = new ArrayList<Subject>();
	}

	
	/////////////////////////////////
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student1.serialNum = serialNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student1 [ID=" + ID + ", name=" + name + ", subjects=" + subjects + "]";
	}
	////////////////////////////////////////////////////////////
	
	
	public void addSubject(String subName, int score) {
		//subjects.add(new Subject(subName, score));
		
		Subject subject = new Subject();
		subject.setSubName(subName);
		subject.setScore(score);
		subjects.add(subject);
		
	}
	
	
	
	public void showStudentInfo() {
		int sum=0;
		for(Subject s : subjects) {
			
			System.out.println("학생 "+name+"의 "+s.getSubName()+"의 과목 성적은 "+s.getScore()+"입니다." );
	
			sum+=s.getScore();
											}
		System.out.println("학생 "+name+"의 "+"총점은 "+sum+"입니다.");
		
	}
	
	
		
	
	
	
	////////////////////////////////
	
	
	
	
	
	
	
	
	
	
}
