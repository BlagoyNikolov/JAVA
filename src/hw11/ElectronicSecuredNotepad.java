package hw11;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IÅlectronicDevice {

	private boolean isStarted;

	private ElectronicSecuredNotepad(int numberOfPages, String password) {
		super(numberOfPages);
		isStarted = false;
	}

	public ElectronicSecuredNotepad(int numberOfPages) {
		super(numberOfPages);
		isStarted = false;
	}

	@Override
	public void start() {
		if (isStarted) {
			System.out.println("Device is already started");
			return;
		}
		isStarted = true;
	}

	@Override
	public void stop() {
		if (!isStarted) {
			System.out.println("Device is already stopped");
			return;
		}
		isStarted = false;
	}

	@Override
	public boolean isStarted() {
		return isStarted;
		}
}
