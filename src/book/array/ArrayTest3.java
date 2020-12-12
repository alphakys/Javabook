package book.array;

public class ArrayTest3 {

	public static void main(String[] args) {
		double[] data = new double[5];
		
		int size = 0;
		
		data[0] =10; size++;
		data[1] =20; size++;
		data[2] =30; size++;
		
		for(int i = 0; i<size; i++)
			System.out.println(data[i]);

	}

}
