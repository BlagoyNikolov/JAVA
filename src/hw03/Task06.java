package hw03;

import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		int i = 0;
		int counter = 0;
		System.out.println("Enter number of elements of first array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arrayOne[] = new int[n];
		
		for (i = 0; i < arrayOne.length; i++) {
			System.out.println("Element " + (i+1) + ":");
			arrayOne[i] = sc.nextInt();
		}
		
		System.out.println("Enter number of elements of second array:");
		int m = sc.nextInt();
		int arrayTwo[] = new int[m];
		
		for (i = 0; i < arrayTwo.length; i++) {
			System.out.println("Element " + (i+1) + ":");
			arrayTwo[i] = sc.nextInt();
		}
		sc.close();
		for (i = 0; i < arrayOne.length; i++) {
			System.out.print(arrayOne[i] + " ");
		}
		System.out.println();
		for (i = 0; i < arrayTwo.length; i++) {
			System.out.print(arrayTwo[i] + " ");
		}
		
		
		if(n == m) {
			System.out.println();
			System.out.print("The arrays have the same size");
			for(i = 0; i < arrayOne.length; i++) {
				if(arrayOne[i] != arrayTwo[i]) 
					counter++;
			}
			if(counter == 0) {
				System.out.println();
				System.out.println("The arrays are identical");
			} else {
				System.out.println();
				System.out.println("The arrays are NOT identical");
			}
		} else {
//			if(counter == 0) {
//				System.out.println();
//				System.out.println("The arrays are identical");
//			} else {
				System.out.println();
				System.out.println("The arrays are NOT identical");
			}
			//System.out.println();
			//System.out.println("The arrays DO NOT have the same size");
	}
}