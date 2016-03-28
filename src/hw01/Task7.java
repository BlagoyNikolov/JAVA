package hw01;

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		//System.out.println("Enter hour: ");
		Scanner Scanner = new Scanner(System.in);
		//int Hour = Scanner.nextInt();

		System.out.println("Enter money balance: ");
		float Money = Scanner.nextFloat();

		System.out.println("Enter health state: ");
		boolean Health = Scanner.nextBoolean();
		
		if (!Health) {
			System.out.println("I won't go out.");
			if (Money > 10) {
				System.out.println("..but I'll buy medecine later.");
			} else {
				System.out.println("I'll drink some tea.");
			}
		} else {
			if (Money < 10) {
				System.out.println("I'll go to a cafe.");
			}else{
				System.out.println("I'll go to a party.");
			}
		}
	}
}