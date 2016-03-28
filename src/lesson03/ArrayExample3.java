package lesson03;

import java.util.Scanner;

public class ArrayExample3 {
	public static void main(String[] args) {
		System.out.println("Enter number of elements: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		int i = 0;
		
		for (i = 0; i < array.length; i++) {
			System.out.println("Enter value of element " + (i + 1));
			array[i] = sc.nextInt();
		}
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		int array2[] = new int[n];
		for (i = 0; i < array.length; i++) {
			array2[i] = array[i];
		}
		System.out.println();
		System.out.println("Duplicate array:");
		for (i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		System.out.println("Duplicate array inverted:");
		for (i = array.length - 1; i >= 0; i--) {
			System.out.print(array2[i] + " ");
		}
	}
}
