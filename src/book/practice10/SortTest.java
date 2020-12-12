package book.practice10;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args)throws IOException {
		
		
		Sort s;
				
		
		System.out.println("정렬 방식");
		System.out.println("B");
		System.out.println("H");
		System.out.println("Q");
		
		int ch = System.in.read();
		
		s = null;
		
		
		if(ch=='B' || ch=='B') {
			s = new BubbleSort();
		}
		else if(ch=='Q' || ch=='q') {
			s = new QuickSort();
		}
		else if(ch=='H' || ch=='h') {
			s = new HeapSort();
		}
		else {
			System.out.println("지원안돼");
			return;
		}
		
		
		int[] arr = new int[10];
		
		
		s.ascending(arr);
		s.descending(arr);
		s.description();
		
		
		
	}

}
