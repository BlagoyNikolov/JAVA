package lesson13.payBG;

import lesson13.payBG.exceptions.PayBGAuthetincationException;
import lesson13.payBG.exceptions.PayBGException;
import lesson13.payBG.exceptions.PayBGInvalidAccountException;
import lesson13.payBG.exceptions.PayBGInvalidAmountException;

public class PayBGService {
	public static void initTransaction(Account sender, Account recipient,
			double amount) throws PayBGInvalidAccountException,
			PayBGAuthetincationException, PayBGInvalidAmountException {

		// ... check account for Anti Fraud rules. call method to sender
		if (sender == null) {
			throw new PayBGInvalidAccountException("No account for sender");
		}
		// sender.<some method>()
		// ... some logic
		try {
			// ....
		} catch (Exception e) {
			throw new PayBGAuthetincationException("Session expired", e);
		}
		new PayBGException("Transaction failed");
	}

	public static double getBallance(Account acc)
			throws PayBGAuthetincationException {
		// acc.getBallance();
		return 0;
	}
}
