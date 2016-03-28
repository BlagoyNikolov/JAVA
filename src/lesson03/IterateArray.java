package lesson03;

public class IterateArray {
	public static void main(String[] args) {
		int[] array = { 2, 5, -7, 1001 };
		System.out.println(array.length);
		// this do not print the array's element
		// System.out.println(array);

		// for (int i = 0; i < array.length; i++) {
		// System.out.print(array[i] + " ");
		// }
		//
		// int i = 0;
		// while (i < array.length) {
		// System.out.print(array[i] + " ");
		// i++;
		// }

		double[] array2 = new double[20];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = 9.5;
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
	}
}
