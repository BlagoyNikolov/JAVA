package lesson13.debug.debug;

public class DebugDemo2 {
	public static void main(String[] args) {

		for (int i = 0; i < 100000; i++) {
			System.out.println(i);
		}
		// some code
		System.out.println("Some other text for print");
	}
}
