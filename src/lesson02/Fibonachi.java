package lesson02;

import java.util.Scanner;

public class Fibonachi {
	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner Scanner = new Scanner (System.in);
		int n = Scanner.nextInt();
		int i = 0;
		int j = 1;
		
		while (i<n) {
			System.out.print(i + " ");
			int tmp = i+j;
			i=j;
			j=tmp;
			
		}
	}
}
