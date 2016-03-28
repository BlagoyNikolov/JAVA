package lesson02;

import java.util.Scanner;

public class Seven {
	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner Scanner = new Scanner(System.in);
		int n = Scanner.nextInt();
		int i = 0;
		while ( i <= n) {
			System.out.println(i);
			i = i + 7;
		}

	}
}
