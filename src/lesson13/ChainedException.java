package lesson13;

public class ChainedException {
	public static void main(String[] args) throws Exception {
		String s = null;
		testMethod(s);
	}

	static void testMethod(String s) throws Exception {
		try {
			testMethod2(s);
		} catch (Exception e) {
			Exception exc = new Exception(e);
			throw exc;
		}
	}

	static void testMethod2(String s) {
		try {
			System.out.println("Test1");
			System.out.println("Test2");
			if (s.equals("test")) {
				System.out.println("Equals");
			}
		} catch (NullPointerException e) {
			throw new RuntimeException("The string is null", e);
		}
	}
}
