package lesson22.producerConsumer;

import java.util.LinkedList;

class SharedQueue {
	private static final int QUEUE_SIZE = 5;
	private LinkedList<String> mQueue = new LinkedList<String>();

	// Invoked by Producers
	public synchronized void put(String aObject) throws InterruptedException {
		System.out.println("mQueue.size: " + mQueue.size());
		while (mQueue.size() == QUEUE_SIZE) {
			System.out.println("queue is full. Waiting for a consumer.");
			wait();
		}
		mQueue.add(aObject);
		notify();
	}

	// Invoked by consumers
	public synchronized String get() throws InterruptedException {
		System.out.println("mQueue.size: " + mQueue.size());
		if (mQueue.size() == 0) {
			System.out.println("queue is empty. Waiting for a producer.");
			wait();
		}
		String message = mQueue.getFirst();
		mQueue.remove(message);
		notify();
		return message;
	}
}