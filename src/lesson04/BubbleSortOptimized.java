package lesson04;

public class BubbleSortOptimized {
	public static void main(String[] args) {
		int[] arr = { 9, 5, 1, 3, 2, 7 };
		boolean isSorted = false;
		int counter = 0;
		for (int i = 0; i < arr.length - 1 && !isSorted; i++) {
			isSorted = true;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				counter++;
				if (arr[j] < arr[j + 1]) {
					isSorted = false;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("Counter: " + counter);
	}
}