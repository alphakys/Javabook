package book.collection.hashset;

import java.util.HashSet;

import book.collection.Member;

public class HashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet mh = new MemberHashSet();
		
		HashSet<Member> m = new HashSet<>();
		
		
		
		Member m1 = new Member("a",1);
		
		mh.addMember(m1);
		mh.showAllMember();

		
		
		
	}

}
