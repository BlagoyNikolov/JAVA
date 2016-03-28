package hw03;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {
		System.out.println("Enter number of elements:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		int i = 0;
		int counter = 1;
		int temp = 1;
		int a = array[0];
		for (i = 0; i < array.length; i++) {
			System.out.println("Enter value of element " + (i + 1));
			array[i] = sc.nextInt();
		}
		//for (i = 0; i < array.length; i++) {
			System.out.print(Arrays.toString(array));
		// }
		for (i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				counter++;
			
				if(counter > temp) {
					a = array[i];
					temp = counter;
				}
			} else {
				counter = 1;
			}
		}
		System.out.println();
		System.out.print("Numbers in a row: ");
		for (int j = 0; j <= temp; j++){
			System.out.print(a + " ");
		}
	}
}