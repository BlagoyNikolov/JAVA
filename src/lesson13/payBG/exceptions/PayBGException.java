package lesson13.payBG.exceptions;

public class PayBGException extends Exception {

	public PayBGException(String message) {
		super(message);
	}

	public PayBGException(Throwable cause) {
		super(cause);
	}

	public PayBGException(String message, Throwable cause) {
		super(message, cause);
	}
}
