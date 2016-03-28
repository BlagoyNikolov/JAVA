package lesson13.payBG;

import lesson13.payBG.exceptions.PayBGAuthetincationException;
import lesson13.payBG.exceptions.PayBGException;
import lesson13.payBG.exceptions.PayBGInvalidAccountException;

public class PayEUService extends PayBGService {
	public static void initTransaction(Account sender, Account recipient,
			double amount) {

		try {
			PayBGService.initTransaction(sender, recipient, amount);
		} catch (PayBGInvalidAccountException | PayBGAuthetincationException e) {

		} catch (PayBGException e) {

		}

	}
}
