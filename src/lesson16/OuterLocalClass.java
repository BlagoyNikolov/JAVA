package lesson16;

public class OuterLocalClass {
	private int h;
	private static int h2;

	void testLocalClass() {
		int y;
		final int z = 10;

		class LocalClass {
			int x;

			void test() {
				// compilation error
				// System.out.println(y);
				System.out.println(z);
				System.out.println(h);
				System.out.println(h2);
			}
		}

		LocalClass test = new LocalClass();

		test.test();
	}
}
