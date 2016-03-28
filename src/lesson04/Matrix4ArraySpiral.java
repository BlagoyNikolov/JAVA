package lesson04;


import java.util.Scanner;

/**
 * 1  2  3  4
 * 12 13 14 5
 * 11 16 15 6  
 * 10 9  8  7  
 */        
public class Matrix4ArraySpiral {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int n = sc.nextInt();
		int start = 0;
		int end = n - 1;
		int count = 1;
		int arr[][] = new int[n][n];

		for (int m = 0; m < n - 2; m++) {
			for (int i = start; i <= end; i++) {
				arr[start][i] = count++;
			}
			for (int j = start + 1; j <= end; j++) {
				arr[j][end] = count++;
			}
			for (int i = end - 1; i > start - 1; i--) {
				arr[end][i] = count++;
			}
			for (int j = end - 1; j > start; j--) {
				arr[j][start] = count++;
			}
			start++;
			end--;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}