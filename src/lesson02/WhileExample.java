package lesson02;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner Scanner = new Scanner (System.in);
		int n = Scanner.nextInt();
		
		for(int i = 1; i < n; i++) {
			if(i % 7 == 0) {
				continue;
			}
			System.out.println(i + " ");
		}
	}
}
		//System.out.println("Enter n");
		// Scanner Scanner = new Scanner (System.in);
		// int n = Scanner.nextInt();
		