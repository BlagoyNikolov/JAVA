package lesson22.bank;

public class BankDemo {
	public static void main(String[] args) throws InterruptedException {
		Account acc = new Account();
		BankClient client1 = new BankClient(acc, 500);
		BankClient client2 = new BankClient(acc, 100);

		client1.start();
		client2.start();

		client1.join();
		client2.join();

		System.out.println("Balance: " + acc.getAmount());
	}
}
