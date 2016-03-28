package lesson16;

public class OuterClass {

	private int x;
	private static int y;
	private InnerStaticClass isc;

	// can be private
	static class InnerStaticClass {
		public static void accessMemberFromTheOuterClass() {
			System.out.println(y);
			// compilation error
			// System.out.println(x);
		}

		public void accessMemberFromTheOuterClass2() {
			System.out.println(y);
			// compilation error
			// System.out.println(x);
		}
	}

}
