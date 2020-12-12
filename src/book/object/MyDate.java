package book.object;

class MyDate1 {
		
	int day;
	int month;
	int year;
	
	
	public MyDate1(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate1 other = (MyDate1) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}




	@Override
	public int hashCode() {
		
		return day * 10 + month * 101 + year * 102;
	}
	
	
	
	
	
	
	
	
	
	
}
	public class MyDate{
		
		public static void main(String[] args) {
			
			
			MyDate1 md = new MyDate1(9,18,2004);
			MyDate1 md1 = new MyDate1(9,18,2004);
			
			System.out.println(md.equals(md1));
			
			System.out.println(md.hashCode());
			
			
		}
		
		
		
	}
	
	
	

