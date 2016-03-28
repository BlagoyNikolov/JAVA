package lesson22.deadlock;

public class Deadlock {

	public static void main(String[] args) throws InterruptedException {
		final Friend f1 = new Friend("F1");
		final Friend f2 = new Friend("F2");
		// f1.bow(f2);
		// f2.bow(f1);
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				f1.bow(f2);
				System.out.println("thread 1 has completed work.");
			}
		});
		t.start();

		// Thread.sleep(2);

		new Thread(new Runnable() {
			@Override
			public void run() {
				f2.bow(f1);
				System.out.println("thread 2 has completed work.");
			}
		}).start();

	}
}