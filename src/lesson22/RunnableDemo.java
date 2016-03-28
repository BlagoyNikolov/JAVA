package lesson22;

public class RunnableDemo {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable r = new MyRunnable();
		// r.run();
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main: " + i);
			Thread.sleep(1000);
		}
	}
}
