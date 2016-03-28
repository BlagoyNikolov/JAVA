package lesson01;

import java.util.Scanner;

public class Chetno {
	public static void main(String[] args) {
		System.out.println("Enter number: \n");
		Scanner scanner = new Scanner (System.in);
		double number = scanner.nextDouble();
		if (number % 2 == 0) {
			System.out.println("The number is chetno");
		} else {
			System.out.println("The number is NOT chetno");
		}
		}
}