package book.array;

public class CharArray {

	public static void main(String[] args) {
		char[] ch = new char[25];
		
		char ch1 = 'a';
		
		
		
		for(int i=0; i<ch.length; i++, ch1++) {
			
			ch[i] = ch1;
		}
			
			
		for(char ch2 : ch) {
			System.out.println(ch2);
		}
		
		
		
		
		
		
	
	
			
	
	
}}
