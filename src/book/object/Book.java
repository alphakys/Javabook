package book.object;

public class Book {
	
	String bookTitle;
	int bookNum;
	
	@Override
	public String toString() {
		return "Book [bookTitle=" + bookTitle + ", bookNum=" + bookNum + "]";
	}

	Book (String bookTitle, int bookNum){
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;
	}

	public static void main(String[] args) {
		
		Book b = new Book("개미",1);
		
		System.out.println(b);
	
		Integer i = new Integer(1);
		
		System.out.println(i);
		
		Integer i1 = new Integer(1);
		
		System.out.println(i);
		
		System.out.println(i.equals(i1));
		
		String str = "a";
		
		String str1 = new String("a");
		
		System.out.println(str.equals(str1));
		
		
	}
	
	
	
	
	
}
