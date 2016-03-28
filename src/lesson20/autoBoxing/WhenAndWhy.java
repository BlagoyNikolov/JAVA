package lesson20.autoBoxing;

public class WhenAndWhy {

	public static void main(String[] args) {
		String s;
		Integer i1 = 5;
		int i2 = 5;

		// s = i2; Compile time error
		// s = i1;
		s = 5 + "";
		System.out.println(s);
		s = Integer.toString(i2);
		System.out.println(s);
		s = i1.toString();
		System.out.println(s);
	}
}
