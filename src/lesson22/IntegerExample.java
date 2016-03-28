package lesson22;

import java.util.concurrent.atomic.AtomicInteger;

public class IntegerExample {
	private static AtomicInteger i = new AtomicInteger(0);

	public static void main(String[] args) throws InterruptedException {
		Thread ex1 = new IntegerExample().new Increment();
		Thread ex2 = new IntegerExample().new Decrement();

		ex2.start();
		ex1.start();

		// ex1.join();
		// ex2.join();

		synchronized (i) {
			System.out.println("Main:" + i);
		}
	}

	private class Increment extends Thread {
		@Override
		public void run() {
			synchronized (i) {
				System.out.println("Increment:" + i.incrementAndGet());
			}
		}
	}

	private class Decrement extends Thread {
		@Override
		public void run() {
			synchronized (i) {
				System.out.println("Decrement:" + i.decrementAndGet());
			}
		}
	}

}
