package book.array;

import java.util.ArrayList;

public class PracticeQ2 {

	public static void main(String[] args) {
		
		ArrayList<Character> ch = new ArrayList<Character>();
		
		for(int i=0;i<25;i++) {
			
			ch.add((char)(65+i));
			
			
		}
		
		for(char ch1 : ch) {
			System.out.println(ch1);
		}
		
		
		
		
		
	}

}
