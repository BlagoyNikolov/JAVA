package hw01;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		System.out.println("Enter first number: ");
		Scanner Scanner = new Scanner(System.in);
		double FirstNumber = Scanner.nextDouble();

		System.out.println("Enter second number: ");
		double SecondNumber = Scanner.nextDouble();

		System.out.println("Enter third number: ");
		double ThirdNumber = Scanner.nextDouble();
		{
			if ((FirstNumber < ThirdNumber) && (ThirdNumber < SecondNumber)
					|| (FirstNumber > ThirdNumber)
					&& (ThirdNumber > SecondNumber)) {
				System.out.println("The number " + ThirdNumber + " is between "
						+ FirstNumber + " and " + SecondNumber);
			} else {
				System.out.println("The number " + ThirdNumber
						+ " is NOT between " + FirstNumber + " and "
						+ SecondNumber);
			}
		}
	}
}