package hw02;

import java.util.Scanner;

public class Task8rev2 {
	public static void main(String[] args) {
		System.out.println("Enter n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int j = 1;
		int k = n - 1;
		for (j = 1; j <= n; j++) {
			for (i = 1; i <= n; i++) {
				System.out.print(k);
				System.out.println();
				k = k + 2;
			}
		}
	}
}