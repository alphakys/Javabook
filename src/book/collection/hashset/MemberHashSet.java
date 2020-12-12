package book.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import book.collection.Member;

public class MemberHashSet {
	
	private HashSet<Member> hashs;
	
	
	
	
	public MemberHashSet() {
		hashs = new HashSet<Member>();
	}
	
	
	public void addMember(Member e) {
		hashs.add(e);
	}
	
	
	
	
	public boolean removeMember(String name) {
		
		Iterator<Member> itr = hashs.iterator();
		
		while(itr.hasNext()) {
			
			Member findMember = itr.next();
			String tempName = findMember.getName();
			if(tempName.equals(name)) {
				hashs.remove(findMember);
			}
		}
		
		System.out.println("해당 이름을 찾을 수 없습니다.");
		return false;
	}
	
	
	public void showAllMember() {
		for(Member member : hashs) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	
	
	
}
