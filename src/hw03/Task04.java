package hw03;

import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
		System.out.println("Enter number of elements:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		int i = 0;
		int counter = 0;
		for (i = 0; i < array.length; i++) {
			System.out.println("Enter value of element " + (i + 1));
			array[i] = sc.nextInt();
		}
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		for (i = 0; i < array.length/2; i++) {
			if (array[i] == array[n - 1 - i]) 
				counter++;
		}
		if(counter != 0) {
			System.out.println();
			System.out.println("The array is specular");
		} else {
			System.out.println();
			System.out.println("The array is NOT specular");
		}
	}
}