package hw02;

import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int Number = sc.nextInt();
		int half = Number / 2;
		int counter = 0;
		int i = 2;
		for (i = 2; i <= half; i++)
			if (Number % i == 0)
				counter++;
		if (counter == 0) {
			System.out.println("The number is simple");
		} else {
			System.out.println("The number is NOT simple");
		}
	}
}