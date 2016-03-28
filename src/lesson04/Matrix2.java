package lesson04;

public class Matrix2 {
	public static void main(String[] args) {
		int n = 4;
		int m = 4;
		int[][] array = new int[n][m];

		int number = 0;
		boolean flag = true;
		for (int i = 0; i < array.length; i++) {
			if (flag) {
				for (int j = 0; j < array[i].length; j++) {
					array[j][i] = ++number;
				}
			} else {
				for (int j = array[i].length - 1; j >= 0; j--) {
					array[j][i] = ++number;
				}
			}
			flag = !flag;
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
