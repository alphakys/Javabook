package book.array;

public class ObjectCopy1 {

	public static void main(String[] args) {
		
		Book[] Barray1 = new Book[3];
		Book[] Barray2 = new Book[3];
		
		
		Barray1[0] = new Book("태", "조");
		Barray1[1] = new Book("데", "헤");
		Barray1[2] = new Book("어떻게", "유");	
		
		//System.arraycopy(src, srcPos, dest, destPos, length);
		
		System.arraycopy(Barray1, 0, Barray2, 0, 3);
		
		for(int i =0; i<Barray2.length;i++) {
			
				Barray2[i].showBookInfo();
				
		}
		
		Barray1[0].setBookName("나목");
		Barray1[0].setAuthor("박완서");
		
		System.out.println("===Barray1===");
			for(int i =0; i<Barray1.length;i++) {
				Barray1[i].showBookInfo();
			}
		
		
		System.out.println("===Barray2===");
			for(int i =0; i<Barray1.length;i++) {
			Barray2[i].showBookInfo();
		}
			
			for(int i =0; i<Barray1.length;i++) {
				System.out.println(Barray1[i]);
				System.out.println(Barray2[i]);
		
	}
			
			
			
			
			
			
			
			
			
			
}
}
