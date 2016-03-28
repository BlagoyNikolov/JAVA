package hw01;

import java.util.Scanner;

public class Task3 {
	private static int ThirdNumber = 0;

	public static void main(String[] args) {
		System.out.println("Enter first number:");
		Scanner Scanner = new Scanner (System.in);
		int FirstNumber = Scanner.nextInt();
		
		System.out.println("Enter second number:");
		int SecondNumber = Scanner.nextInt();
		
		ThirdNumber = FirstNumber;
		FirstNumber = SecondNumber;
		SecondNumber = ThirdNumber;
		
		
		System.out.println("The numbers inverted: " + FirstNumber + " " + SecondNumber);
	}
}
