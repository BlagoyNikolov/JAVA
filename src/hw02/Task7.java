package hw02;

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		System.out.println("Enter n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tmp = 0;
		for (int i = 1; i < n; i++) {
			tmp = tmp + 3;
			System.out.print(tmp + ",");
		}
		tmp = tmp + 3;
		System.out.print(tmp);
	}
}