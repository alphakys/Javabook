package book.collection.arraylist;

import java.util.Iterator;

import book.collection.Member;

public class Test {

	public static void main(String[] args) {
		
		

		
		MemberArrayList m = new MemberArrayList();
		

		
		
		m.removeMember(5);
		
		for(Member member : m.getmArr()) {
			System.out.println(member);
		}
		
		
		
		
	}

}
