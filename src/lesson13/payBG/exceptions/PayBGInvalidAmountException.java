package lesson13.payBG.exceptions;

import lesson13.payBG.Account;

public class PayBGInvalidAmountException extends PayBGException{

	private double currentBallance;
	private Account account;
	
	public PayBGInvalidAmountException(String message, Throwable cause, double currentBallance, Account acc) {
		super(message, cause);
		this.currentBallance = currentBallance;
		this.account = acc;
	}
	
	public boolean isBallanceNegative() {
		return currentBallance < 0;
	}
	
	public Account getAccount() {
		return account;
	}
	
}
