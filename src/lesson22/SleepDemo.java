package lesson22;

public class SleepDemo {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 30; i++) {
			Thread.sleep(10000);
			System.out.println("I = " + i);
		}
	}
}
