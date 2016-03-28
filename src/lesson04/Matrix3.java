package lesson04;

import java.util.Scanner;

public class Matrix3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();

		System.out.println("Enter m:");
		int m = sc.nextInt();

		int[][] array = new int[n][m];

		int i = n - 1;
		int j = 0;
		int number = 0;

		while (j <= m - 1) {

			int ii = i;
			int jj = j;
			while (ii <= n - 1 && jj <= m - 1) {
				array[ii][jj] = ++number;
				ii++;
				jj++;
			}
			// change i
			if (i != 0) {
				i--;
			} else {
				// change j
				j++;
			}
		}

		for (int k = 0; k < array.length; k++) {
			for (int l = 0; l < array[0].length; l++) {
				System.out.print(array[k][l] + " ");
				if (array[k][l] < 10) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
