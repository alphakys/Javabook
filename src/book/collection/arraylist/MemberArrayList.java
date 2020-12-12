package book.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import book.collection.Member;

public class MemberArrayList {
	
	private ArrayList<Member> mArr;
	
	public MemberArrayList(){
		mArr = new ArrayList<>();
		
	}
	
	
	
	
	public void addMember(Member member) {
		
		mArr.add(member);
		
	}
	
	
	
	
/*public interface Iterator{
	boolean hasNext();
	Object next();
	void remove();
	*/
	
	public boolean removeMember(int ID) {
		
		Iterator<Member> itr = mArr.iterator();
		
		while(itr.hasNext()) {
			
			int foundId = itr.next().getID();
			if(foundId==ID) {
				itr.remove();
				return true;
			}
		
			
		}
	System.out.println("찾는 아이디는 존재하지 않습니다");
				return false;
}

	
	public void showAllMember() {
		for(Member member : mArr) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	
	
	public void insertMember(int index, Member member) {
		
		
		mArr.add(index, member);
		
	}
	
	
	
	
	
	
	
	
	
	public Member getMember(int index) {
		
		return mArr.get(index);
		
	}
	
	
	
	public ArrayList<Member> getmArr() {
		return mArr;
	}

	
	
	public void setmArr(ArrayList<Member> mArr) {
		this.mArr = mArr;
	}
	
	
	
	
	
	
}