package lesson12;

public class ExceptionTest {
	// THE RIGHT WAY TO WRITE THIS:

	// static void printArrayInfo(int[] array) {
	// if(array != null && array.length >= 3) {
	// System.out.println("Array's length is " + array.length);
	// System.out.println("The third element is " + array[2]);
	// } else {
	// System.out.println("The array is null or has less than 3 elemnts!");
	// }
	// System.out.println("test");
	// System.out.println("Some message");
	// }

	static void printArrayInfo(int[] array)
			throws ArrayIndexOutOfBoundsException {
		try {
			System.out.println("Array's length is " + array.length);
			System.out.println("The third element is " + array[2]);
			System.out.println("test");
		} catch (NullPointerException e) {
			System.out.println("The array is null!");
		}

		System.out.println("Some message");
	}

	public static void main(String[] args) {
		// int[] arr = { 1, -123, 20, 0, 2 };
		// int[] arr = null;
		int[] arr = { 1, 22 };
		ExceptionTest.printArrayInfo(arr);

		try {
			ExceptionTest.printArrayInfo(arr);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The array has less than 3 elements!");
			e.printStackTrace();
		}
		System.out.println("Test.......");
	}
}
