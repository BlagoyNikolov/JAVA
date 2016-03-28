package hw08;

public class Call {
	private static double priceForAMinute = 0.40;
	private GSM caller;
	private GSM receiver;
	private double duration;
	
	public Call(GSM caller, GSM receiver, double duration) {
		setCaller(caller);
		setReceiver(receiver);
		setDuration(duration);
	}
	
	public static double getPriceForAMinute() {
		return priceForAMinute;
	}
	public static void setPriceForAMinute(double priceForAMinute) {
		Call.priceForAMinute = priceForAMinute;
	}
	public GSM getCaller() {
		return caller;
	}
	public void setCaller(GSM caller) {
		this.caller = caller;
	}
	public GSM getReceiver() {
		return receiver;
	}
	public void setReceiver(GSM receiver) {
		this.receiver = receiver;
	}
	public double getDuration() {
		if (duration > 0 && duration < 120) {
			return duration;
		} else {
			System.out.println("error: exceeded call duration");
			return 0;
		}
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "" + duration;
	}
}