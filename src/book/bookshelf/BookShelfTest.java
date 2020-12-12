package book.bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		
		
		
		Queue q = new BookShelf();
		
		q.enQueue("강용수의 알파메일이 되는 법");
		
		System.out.println(q.getSize());
		
		q.deQueue();
		
		System.out.println(q.getSize());
	}

}
