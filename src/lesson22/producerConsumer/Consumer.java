package lesson22.producerConsumer;

class Consumer extends Thread {
	private SharedQueue sharedQueue;

	public Consumer(SharedQueue sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		try {
			while (true) {
				String message = sharedQueue.get();
				System.out.println(getName() + ": get " + message);
				sleep(2500);
			}
		} catch (InterruptedException e) {
		}
	}
}