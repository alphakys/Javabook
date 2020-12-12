package book.collection.arraylist;

import java.util.ArrayList;

public class Myqueue {
	
	private ArrayList<String> qu = new ArrayList<>();
	
	public void enQu(String data) {
		
		qu.add(data);
	}
	
	
	public String deQu() {
		
		if(qu.size()==0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return qu.remove(0);
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Myqueue q = new Myqueue();
		
		q.enQu("a");
		q.enQu("b");
		q.enQu("c");
		
		System.out.println(q.deQu());
		
		
	}

}
