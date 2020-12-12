package book.array;

public class Twodimension1_1 {

	public static void main(String[] args) {
				
		char ch = 'a';
		
		char[][] alpha = new char[13][2];
				
		
		for(int i =0;i<alpha.length;i++) {
			
			for(int j=0;j<alpha[0].length;j++) {
				alpha[i][j] = ch;
				ch++;
				System.out.print(alpha[i][j]);
			}
				System.out.println();
		}
		
		
		
		
		
		
		
	}

}
