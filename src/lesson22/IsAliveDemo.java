package lesson22;

import lesson22.task.Counter;

public class IsAliveDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread[] threads = new Thread[3];
		Counter counter = new Counter();
		
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(counter, "Thread #" + (i+1));
			threads[i].start();
		}
		
		int i = 0;
		while(threads[0].isAlive() || threads[1].isAlive() || threads[2].isAlive()) {
			i++;
			System.out.println(i);
			Thread.sleep(500);
		}
		
		System.out.println("All threads are dead");
		System.out.println("I = " + i);
	}
}
