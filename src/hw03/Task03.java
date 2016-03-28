package hw03;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[10];
		array[0] = n;
		array[1] = n;
		int i = 0;
		for (i = 2; i < array.length; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}