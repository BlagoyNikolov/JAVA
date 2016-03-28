package hw01;

import java.util.Scanner;

public class Task4 {
	private static int ThirdNumber = 0;
	
	public static void main(String[] args) {
		System.out.println("Enter first number:");
		Scanner Scanner = new Scanner (System.in);
		int FirstNumber = Scanner.nextInt();
		
		System.out.println("Enter second number:");
		int SecondNumber = Scanner.nextInt();
		{
			if (FirstNumber<SecondNumber) {
				System.out.println("The numbers in ascending order: " + FirstNumber + " " + SecondNumber);
			} else {
				if (FirstNumber == SecondNumber) {
					System.out.println("The numbers are qeual.");
				} else {
					ThirdNumber = FirstNumber;
					FirstNumber = SecondNumber;
					SecondNumber = ThirdNumber;
				System.out.println("The numbers in ascending order: " + FirstNumber + " " + SecondNumber);
				}
			}
		}
	}
}
