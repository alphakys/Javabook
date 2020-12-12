package book.collection.linkedlist;

import java.util.LinkedList;

public class LinkedTest {

	public static void main(String[] args) {
		
		LinkedList<String> sl = new LinkedList<>();
		
		sl.add("a");
		sl.add("b");
		sl.add("c");
		
		System.out.println(sl);
		
		sl.add(1,"d");
		
		System.out.println(sl);
		
		
	}

}
