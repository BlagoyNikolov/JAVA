package lesson22;

import lesson22.task.Counter;

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread[] threads = new Thread[3];
		Counter counter = new Counter();

		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(counter, "Thread #" + (i + 1));
			threads[i].start();
			// threads[i].join();
		}

		threads[0].join();
		threads[1].join();
		threads[2].join();

		System.out.println("All threads are dead");
	}
}
