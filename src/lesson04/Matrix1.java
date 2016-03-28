package lesson04;

public class Matrix1 {
	public static void main(String[] args) {
		int n = 4;
		int m = 4;
		int[][] array = new int[n][m];

		int number = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[j][i] = ++number;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
