package hw01;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		System.out.println("Enter first number: ");
		Scanner Scanner = new Scanner(System.in);
		int FirstNumber = Scanner.nextInt();

		System.out.println("Enter second number: ");
		int SecondNumber = Scanner.nextInt();

		System.out.println("Enter third number: ");
		int ThirdNumber = Scanner.nextInt();

		if ((FirstNumber > SecondNumber && FirstNumber > ThirdNumber))
        {
            if(SecondNumber > ThirdNumber)
            {
                System.out.print(FirstNumber + " " + SecondNumber + " " + ThirdNumber);
            }
            else
                System.out.print(FirstNumber + " " + ThirdNumber + " " + SecondNumber);
        }
        else if ((SecondNumber > FirstNumber && SecondNumber > ThirdNumber))
        {
            if(FirstNumber > ThirdNumber)
            {
                System.out.print(SecondNumber + " " + FirstNumber + " " + ThirdNumber);
            }
            else
                {
                System.out.print(SecondNumber + " " + ThirdNumber + " " + FirstNumber);
                }
        }
        else if ((ThirdNumber > FirstNumber && ThirdNumber > SecondNumber))
        {
            if(FirstNumber > SecondNumber)
            {
                System.out.print(ThirdNumber + " " + FirstNumber + " " + SecondNumber);
            }
            else
                System.out.print(ThirdNumber + " " + SecondNumber + " " + FirstNumber);
        }
	}
}