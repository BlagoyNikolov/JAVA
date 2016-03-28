package hw04;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		System.out.println("Enter n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter m: ");
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = 1 + j + n * i;
				}
			} else {
				for (int j = arr[i].length - 1; j >= 0; j--) {
					arr[i][j] = 1 + (arr[i].length - 1 - j) + n * i;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}