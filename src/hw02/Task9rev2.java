package hw02;

import java.util.Scanner;

public class Task9rev2 {
	public static void main(String[] args) {
		System.out.println("Enter A: ");
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		System.out.println("Enter B: ");
		int B = sc.nextInt();
		int sum = 0;
		int tmp = 1;
		int i = A * A;
		System.out.print(i);
		for (i = A; i <= B; i++) {
			tmp = i * i;
			// System.out.print(" sum: " + sum);
			if (tmp % 3 != 0) {
				sum += i*i;
				if (sum >= 200) {
					break;
				} else {
					if (i > A) {
						System.out.println();
					}
				}
				System.out.print(", skip " + i);
				// continue;
				// System.out.print(tmp + ",");
			} else {
				System.out.print(", " + tmp);
				sum = sum + tmp;
			}
			if (sum > 200) {
				break;
			}
		}
	}
}