package lesson03;

public class CopyArrays {
	public static void main(String[] args) {
		// int[] oldArray = { 2, 3, 4 };
		// int[] newArray = oldArray;
		//
		// oldArray[1] = -100;
		// System.out.println(newArray[1]);

		int[] oldArray = { 2, 3, 4 };
		int[] newArray = new int[oldArray.length];

		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = oldArray[i];
		}

		oldArray[1] = -100;
		System.out.println(newArray[1]);
	}
}
