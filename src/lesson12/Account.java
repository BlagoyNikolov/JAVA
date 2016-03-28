package lesson12;

public class Account {
	private int sum;

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public void withdraw(int sum) {
		if (sum < 0) {
			throw new IllegalArgumentException();
		}
		System.out.println("Withdrawing: " + sum);
		this.sum -= sum;
	}
}
