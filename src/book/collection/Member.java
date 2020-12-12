package book.collection;

public class Member {
	private String name;
	private int ID;
	
	
	public Member(String name, int ID) {
		this.name = name;
		this.ID = ID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	@Override
	public String toString() {
		return name+" 회원님의 아이디는 "+ ID +"입니다.";
	}
	
	
	
	
	
	
	
	
	
	
	
}
