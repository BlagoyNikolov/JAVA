package lesson13.payBG.exceptions;

public class PayBGInvalidAccountException extends PayBGException {

	public PayBGInvalidAccountException(String message) {
		super(message);
	}
	
	public PayBGInvalidAccountException(String message, Throwable cause) {
		super(message, cause);
	}

}
