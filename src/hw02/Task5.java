package hw02;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		System.out.println("Enter first number: ");
		Scanner sc = new Scanner(System.in);
		int FirstNumber = sc.nextInt();
		System.out.println("Enter second number: ");
		int SecondNumber = sc.nextInt();
		if (FirstNumber < SecondNumber) {
			for (int i = FirstNumber; i <= SecondNumber; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = SecondNumber; i <= FirstNumber; i++) {
				System.out.print(i + " ");
			}
		}
	}
}
