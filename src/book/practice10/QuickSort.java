package book.practice10;

public class QuickSort implements Sort {

	@Override
	public void ascending(int[] intArr) {
		System.out.println("QuickSort ascending");
	}

	@Override
	public void descending(int[] intArr) {
		System.out.println("QuickSort descending");
	}

	@Override
	public void description() {
		System.out.println("숫자를 정렬하는 알고리즘\nQuickSort입니다.");
	}

}
