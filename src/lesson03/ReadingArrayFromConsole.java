package lesson03;

import java.util.Scanner;

public class ReadingArrayFromConsole {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("Enter size of the array:");
			n = sc.nextInt();
		} while (n <= 0);

		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter value for element " + (i + 1));
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
