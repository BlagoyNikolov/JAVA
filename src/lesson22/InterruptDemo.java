package lesson22;

import lesson22.task.Counter;

public class InterruptDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread[] threads = new Thread[5];
		Counter counter = new Counter();

		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(counter, "Thread #" + (i + 1));
			threads[i].start();
		}
		Thread.sleep(500);
		threads[0].interrupt();
		Thread.sleep(5000);
		threads[0].start();
	}
}
