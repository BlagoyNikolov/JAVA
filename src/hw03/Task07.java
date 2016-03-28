package hw03;

import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {
		System.out.println("Enter number of elements:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arrayOne[] = new int[n];
		int i = 0;
		for (i = 0; i < arrayOne.length; i++) {
			System.out.println("Element " + (i+1) + ":");
			arrayOne[i] = sc.nextInt();
		}
		for (i = 0; i < arrayOne.length; i++) {
			System.out.print(arrayOne[i] + " ");
		}
		System.out.println();
		int arrayTwo[] = new int[n];
		arrayTwo[0] = arrayOne[1];
		arrayTwo[n - 1] = arrayOne[n - 2];
		for (i = 1; i < arrayOne.length-1; i++) {
			arrayTwo[i] = arrayOne[i - 1] + arrayOne[i + 1];
		}
		for (i = 0; i < arrayTwo.length; i++) {
			System.out.print(arrayTwo[i] + " ");
		}
	}
}