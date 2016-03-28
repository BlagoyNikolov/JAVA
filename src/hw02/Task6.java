package hw02;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int Number = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= Number; i++) {
			sum = sum + i;	
		}
		System.out.println("The result is: " + sum);
	}
}