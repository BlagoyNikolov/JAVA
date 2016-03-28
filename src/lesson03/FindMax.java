package lesson03;

import java.util.Scanner;

public class FindMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array's size:");
		int size = sc.nextInt();
		int[] array = new int[size];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter value:");
			array[i] = sc.nextInt();
		}
		// find the max element
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("The max element is " + max);
	}
}
