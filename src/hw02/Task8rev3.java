package hw02;

import java.util.Scanner;

public class Task8rev3 {
	public static void main(String [] args) {
		System.out.println("Enter n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int number = n - 1;
		for(int i = 0; i < n; i+=1) {
			for (int j = 0; j < n; j++) {
				System.out.print((n - 1) + (i*2)); //(number)
			}
			System.out.println();
			//number += 2;
		}
	}
}