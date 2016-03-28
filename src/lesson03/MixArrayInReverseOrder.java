package lesson03;

import java.util.Scanner;

public class MixArrayInReverseOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array's size:");
		int size = sc.nextInt();
		int[] array = new int[size];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter value:");
			array[i] = sc.nextInt();
		}

		// reverse order
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}

		// Reverse order - second option
		// for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--)
		// {
		// int temp = array[i];
		// array[i] = array[j];
		// array[j] = temp;
		// }

		// print the changed array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
