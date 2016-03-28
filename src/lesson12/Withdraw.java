package lesson12;

public class Withdraw {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Account[] acc = new Account[5];

		for (int i = 0; i < acc.length; i++) {
			Account tmp = new Account();
			tmp.setSum(100);
			acc[i] = tmp;
		}

		bank.setAcc(acc);

		for (int i = 0; i < 10; i++) {
			try {
				bank.getAcc()[i].withdraw(i - 2);
			} catch (IllegalArgumentException e) {
				System.out.println("Can't withdraw negative amount");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("No account to withdraw from");
			}
		}

	}
}
