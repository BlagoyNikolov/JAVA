package lesson03;

public class CompareArrays {
	public static void main(String[] args) {
		double[] array1 = { 2, -5, 7 };
		double[] array2 = new double[3];
		array2[0] = 2;
		array2[1] = -5;
		array2[2] = 7;
		// array2[3] = 4;

		array1 = array2;

		boolean equals = array1 == array2;
		System.out.println(equals);

		// boolean isEquals = true;
		// for (int i = 0; i < array1.length; i++) {
		// if(array1[i] != array2[i]) {
		// isEquals = false;
		// break;
		// }
		// }

		// System.out.println(isEquals);
	}
}
