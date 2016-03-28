package lesson03;

public class MatrixExample {
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		// int[] matrix[] = { { 1, 2, 3, 7 }, { 4, 5, 6 } };

		System.out.println(matrix.length);
		System.out.println(matrix[0].length);
		System.out.println(matrix[1].length);

		// for (int i = 0; i < matrix.length; i++) {
		// for (int j = 0; j < matrix[1].length; j++) {
		// matrix[i][j] = 5;
		// }
		// }

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
	}
}
