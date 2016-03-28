package hw01;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		System.out.println("Enter first number: ");
		Scanner Scanner = new Scanner (System.in);
		float FirstNumber = Scanner.nextFloat();
		
		System.out.println("Enter second number: ");
		float SecondNumber = Scanner.nextFloat();
		
		float Sum = FirstNumber + SecondNumber;
		System.out.println("The sum of the numbers is: " + Sum);
		
		float Subtraction = FirstNumber - SecondNumber;
		System.out.println("The difference between the numbers is: " + Subtraction);
		
		float Multiplication = FirstNumber * SecondNumber;
		System.out.println("The multiplication of the numbers is: " + Multiplication);
		
		float Division = FirstNumber / SecondNumber;
		System.out.println("The division of the numbers is: " + Division);
		
		float IntegerDivision = FirstNumber % SecondNumber;
		System.out.println("The result of the integer division of the numbers is: " + IntegerDivision);
	}
}