package lesson22.bank;

public class Bank {
	// public static synchronized void deposit(Account acc, double amount) {
	// double oldAmount = acc.getAmount();
	// double newAmount = oldAmount + amount;
	// acc.setAmount(newAmount);
	// }

	public static void deposit(Account acc, double amount) {
		synchronized (acc) {
			double oldAmount = acc.getAmount();
			double newAmount = oldAmount + amount;
			acc.setAmount(newAmount);
		}
	}

	public static void withdraw(Account acc, double amount) {
		synchronized (acc) {
			double oldAmount = acc.getAmount();
			double newAmount = oldAmount - amount;
			acc.setAmount(newAmount);
		}
	}
}
