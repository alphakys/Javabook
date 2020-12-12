package book.array;

import java.util.ArrayList;

public class PracticeQ3 {

	public static void main(String[] args) {
		
	int[] a = new int[5];
	int sum=0;
	for(int i=0; i<a.length;i++) {
		
		
		sum+=2;
		a[i] = sum;
		
	}
		
		sum=0;
	for(int i=0; i<a.length;i++) {
		
		sum+=a[i];
		
		
	}System.out.println(sum);
		
		
	}

}
