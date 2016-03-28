package hw03;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		System.out.println("Enter an even number of elements:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;
		int array[] = new int[n];
		System.out.println("Enter " + n/2 + " elements.");
		for(i = 0; i < array.length/2; i++) {
			System.out.println("Element " + (i+1) + ":");
			array[i] = sc.nextInt();
		}
		for (i = 0; i < array.length/2; i++) {
			array[i + n/2] = array[i];
		}
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}