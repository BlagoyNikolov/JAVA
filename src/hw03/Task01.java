package hw03;

import java.util.Scanner;

public class Task01 {
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
		int tmp = array[0];
		for (i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				if (array[i] < tmp) {
					tmp = array[i];
				}
			}
		}
		System.out.println();
		System.out.println("The smallest number divisable by 3 is: " + tmp);
	}
}