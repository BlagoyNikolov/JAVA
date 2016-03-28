package lesson22.bank;

public class BankClient extends Thread {
	private Account account;
	private double amountToAdd;
	
	public BankClient(Account account, double amountToAdd) {
		this.account = account;
		this.amountToAdd = amountToAdd;
	}

	@Override
	public void run() {
		Bank.deposit(account, amountToAdd);
	}
}
