package hw01;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		System.out.println("Enter a1: ");
		Scanner Scanner = new Scanner(System.in);
		int a1 = Scanner.nextInt();

		System.out.println("Enter a2: ");
		int a2 = Scanner.nextInt();

		System.out.println("Enter a3: ");
		int a3 = Scanner.nextInt();
		
		int temp = a1;
		a1 = a2;
		a2=a3;
		a3=temp;
		System.out.println("a1: " + a1 + ", a2: " + a2 + ", a3: " + a3);
	}
}