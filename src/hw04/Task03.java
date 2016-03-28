package hw04;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		System.out.println("Enter n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter m: ");
		int m = sc.nextInt();
		int counter = 1;
		int array[][] = new int[n][m];
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < n - i && j<m; j++) {
				array[i + j][j] = counter;
				counter++;
			}
		}
		for (int i = m - 1; i >= 0; i--) {
			for (int j = 0; j < i && j<n; j++) {
				array[j][j + m - i] = counter;
				counter++;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++){
				System.out.print(array[i][j] + " ");
			}
		System.out.println();
		}
		sc.close();
	}
}