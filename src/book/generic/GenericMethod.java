package book.generic;

public class GenericMethod {

	public static <T, V> double makeRect(Point<Integer, Double> p1, Point<Integer, Double> p2) {
		
		double width = p2.getX() - p1.getX();
		double height = p2.getY() - p1.getY();
		
		
		
		double rect = width*height;
		return rect;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Point<Integer, Double> p1 = new Point(0,0.0);
		Point<Integer, Double> p2 = new Point(10, 10.0);
		
		
		
		double rect = GenericMethod.<Integer, Double>makeRect(p1,p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 "+rect+"입니다.");
		
		
		
	}

}
