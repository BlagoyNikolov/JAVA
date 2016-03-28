package lesson01;

import java.util.Scanner;

public class BooleanTest {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		boolean test = in.nextBoolean();
		boolean test2 = true;
		
		test=test2;
		
		if(test) {
			System.out.println(test);
		} else { 
			System.out.println(test2);
		}
	}
}
