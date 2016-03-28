package lesson03;

import java.util.Scanner;

public class ArrayExample4 {
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
		for (i = 0; i < array.length/2; i++) { 
			int tmp = array[array.length-1-i];
			array[array.length-1-i] = array[i];
			array[i] = tmp;
			
		}
		System.out.println();
		System.out.println("Array inverted:");
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}