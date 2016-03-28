package lesson22.producerConsumer;

public class ProducerConsumerDemo {

	public static void main(String args[]) throws InterruptedException {
		SharedQueue sharedQueue = new SharedQueue();
		Producer producer1 = new Producer(sharedQueue);
		Producer producer2 = new Producer(sharedQueue);
		Producer producer3 = new Producer(sharedQueue);
		Producer producer4 = new Producer(sharedQueue);
		producer1.start();
		producer2.start();
		producer3.start();
		producer4.start();

		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + "...");
			Thread.sleep(1000);
		}
		System.out.println();
		Consumer consumer1 = new Consumer(sharedQueue);
		consumer1.setName("consumer Mincho");
		consumer1.start();
		Consumer consumer2 = new Consumer(sharedQueue);
		consumer2.setName("consumer Pencho");
		// consumer2.start();

		Consumer c3 = new Consumer(sharedQueue);
		c3.setName("c3");
		Consumer c4 = new Consumer(sharedQueue);
		c4.setName("c4");
		Consumer c5 = new Consumer(sharedQueue);
		c5.setName("c5");

		// c3.start();
		// c4.start();
		// c5.start();
	}
}