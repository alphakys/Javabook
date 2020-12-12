package book.array;

public class ObjectCopy3 {

	public static void main(String[] args) {
		Book[] Barray1 = new Book[3];
		Book[] Barray2 = new Book[3];
		
		
		Barray1[0] = new Book("태", "조");
		Barray1[1] = new Book("데", "헤");
		Barray1[2] = new Book("어떻게", "유");	
		
		Barray2[0] = new Book();
		Barray2[1] = new Book();
		Barray2[2] = new Book();
		
		for(int i =0; i<Barray1.length;i++) {
			Barray2[i].setBookName(Barray1[i].getBookName());
			Barray2[i].setBookName(Barray1[i].getAuthor());
			
			
		}
		
		
		Barray1[0].setBookName("나목");
		Barray1[0].setAuthor("박완서");

		
		for(int i =0; i<Barray1.length;i++) {
			Barray1[i].showBookInfo();
		}
		
		for(int i =0; i<Barray2.length;i++) {
			Barray2[i].showBookInfo();
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
