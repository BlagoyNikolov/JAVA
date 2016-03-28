package lesson10;

public class PhilipsRemoteController implements IDVDRemoteController,
		ITVRemoteController {
	// here we can define fields, because this is class
	private int channels;
	private double infraRedDistance;
	private double battery;

	public void chargeBatery() {
		battery = 100;
	}

	@Override
	public void startTV() {
		System.out.println("Start TV...");
		System.out.println("Changing channel to NOVA");
	}

	@Override
	public void stopTV() {
		System.out.println("Stop TV...");
	}

	@Override
	public void channelUp() {
		System.out.println("Channel up...");
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub

	}

	@Override
	public void goToChannel(int newChannel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void play() {

	}

	@Override
	public void stop() {

	}

	@Override
	public void insertDisc() {

	}

	@Override
	public void eject() {

	}

}
