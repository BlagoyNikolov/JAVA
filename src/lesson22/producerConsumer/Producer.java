package lesson22.producerConsumer;

import java.util.Date;

class Producer extends Thread {
	private SharedQueue sharedQueue;

	public Producer(SharedQueue sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	public void run() {
		try {
			while (true) {
				String message = new Date().toString();
				sharedQueue.put(message);
				System.out.println("producer: put " + message);
				sleep(1300);
			}
		} catch (InterruptedException e) {
		}
	}
}