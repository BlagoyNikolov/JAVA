package lesson13;

public class FinallyExample {
	public static void main(String[] args) {
		String s = null;
		
		try {
			System.out.println("Test 1");
			System.out.println("Test 2");
			if(s == null) {
				throw new NullPointerException("Opps...");
			}
			System.out.println("Test 3");
			System.out.println("Test 4");
		} finally {
			System.out.println("Execute some cleanup code...");
		}
		
	}
}
