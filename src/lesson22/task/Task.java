package lesson22.task;

public class Task {
	public static void main(String[] args) {
		Thread[] threads = new Thread[5];
		Counter counter = new Counter();

		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(counter, "Thread #" + (i + 1));
			threads[i].start();
		}
	}
}
