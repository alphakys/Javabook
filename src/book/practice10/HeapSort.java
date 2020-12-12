package book.practice10;

public class HeapSort implements Sort {

	@Override
	public void ascending(int[] intArr) {
		System.out.println("HeapSort ascending");
	}

	@Override
	public void descending(int[] intArr) {
		System.out.println("HeapSort descending");
	}

	@Override
	public void description() {
		System.out.println("숫자를 정렬하는 알고리즘\nHeapSort입니다.");
	}

}
