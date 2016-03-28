package lesson13.debug.debug;

public class DebugDemo3 {
	public static void main(String[] args) {
		String start = "Start";
		if(start.equals("Start")) {
			int a = 10;
			int b = a--;
			b = --a;
			System.out.println(b);
		}
		printText4Times("SoftAcad");
		System.out.println("End of the main method");
	}

	private static void printText4Times(String text) {
		for (int i = 0; i < 4; i++) {
			System.out.println(text);
		}
		System.out.println("End of the method printText4Times");
		//go to method from another class
	}
}
