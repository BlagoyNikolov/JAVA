package hw08;

public class GSM {
	private String model;
	private boolean hasSimCard;
	private String simMobileNumber;
	private double outgoingCallsDuration;
	private Call lastIncomingCall;
	private Call lastOutgoingCall;
	
	public GSM (String model) {
		this.model = model;
	}
	
	public Call getLastIncomingCall() {
		return lastIncomingCall;
	}

	public void setLastIncomingCall(Call lastIncomingCall) {
		this.lastIncomingCall = lastIncomingCall;
	}

	public Call getLastOutgoingCall() {
		return lastOutgoingCall;
	}

	public void setLastOutgoingCall(Call lastOutgoingCall) {
		this.lastOutgoingCall = lastOutgoingCall;
	}

	void insertSimCard(String simMobileNumber) {
		if ((simMobileNumber.startsWith("08")) && (simMobileNumber.length() == 10)) {
			this.simMobileNumber = simMobileNumber;
			hasSimCard = true;
			System.out.println("the number is validated");
		} else {
			System.out.println("error: the number is not valid");
		}
	}
	
	void removeSimCard() {
		hasSimCard = false;
	}
	
	void call(GSM receiver, double duration) {
		int checkAllParameters = 0;
		
		if (duration > 0 && duration < 120){
			System.out.println("call duration within limits");
			checkAllParameters++;
		} else {
			System.out.println("error: exceeded call duration");
		}
		
		if (this.simMobileNumber != receiver.simMobileNumber) {
			System.out.println("the caller and the receiver's numbers are different");
			checkAllParameters++;
		} else {
			System.out.println("error: identical numbers");
		}
		
		if (this.hasSimCard && receiver.hasSimCard) {
			System.out.println("Both phones have SIM cards");
			checkAllParameters++;
		} else {
			System.out.println("error: the phones have no SIM cards");
		}
		
		if (checkAllParameters == 3) {
			Call call = new Call (this, receiver, duration);
			this.lastOutgoingCall = call;
			receiver.lastIncomingCall = call;
			this.outgoingCallsDuration += duration;
			System.out.println("Call in progress...");
		} else {
			System.out.println("error: fatal error: cannot place call");
		}
	}
	
	public double getSumForCall() {
		double sum = outgoingCallsDuration * Call.getPriceForAMinute();
		System.out.println("The sum for call is: " + sum);
		return sum;
	}
	
	void print() {
		System.out.println("--------------------------------------");
		System.out.println("Model: " + model);
		System.out.println("SIM: " + hasSimCard);
		System.out.println("Sim Mobile Number: " + simMobileNumber);
		System.out.println("Outgoing Call Duration: " + outgoingCallsDuration);
	}
	
	void printInfoForTheLastOutgoingCall() {
		print();
		System.out.println("Last Outgoing Call: " + lastOutgoingCall);
		
	}
	
	void printInfoForTheLastIncomingCall() {
		print();
		System.out.println("Last Incoming Call: " + lastIncomingCall);
		
	}
	
	@Override
	public String toString() {
		return "" + lastIncomingCall;
	}
}