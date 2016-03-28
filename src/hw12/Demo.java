package hw12;

public class Demo {
	public static void main(String[] args) {
		int[] a1 = { 8, 3, 10, 24, 0, 4, 7, 14 };
		int[] a2 = { 4, 0, 5, 3, 9, 4 };
		
			for(int i = 0; i < a1.length; i++) {
				System.out.print(a1[i] + " ");
			}
			
			System.out.println();
			for(int i = 0; i < a2.length; i++) {
				System.out.print(a2[i] + " ");
			}
			
			System.out.println();
			devideArrays(a1, a2);
	}
	
	public static void devideArrays(int[] a1, int[] a2) {
		int size = a1.length;
		if(a2.length > a1.length) {
			size = a2.length;
		}
		int[] a3 = new int[size];
		
		for (int i = 0; i < a3.length; i++) {
			try {
				a3[i] = a1[i] / a2[i];
			} catch (ArrayIndexOutOfBoundsException e) {
				//System.out.println("exception: ArrayIndexOutOfBoundsException");
				a3[i] = -1;
				//e.printStackTrace();
			} catch (ArithmeticException e) { 
				//System.out.println("exception: ArithmeticException: Cannot divide by zero!");
				a3[i] = 0;
				//e.printStackTrace();
			} finally {
				System.out.print(a3[i] + " ") ;
			}
		}
	}
}
