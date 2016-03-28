package lesson10;

public class SamsungDVDRemoteController implements IDVDRemoteController{

	public void play() {
		System.out.println("Samsung play");
	}

	public void stop() {
		System.out.println("Samsung stop");
	}

	public void insertDisc() {
		System.out.println("Samsunung insert disc");
	}

	public void eject() {
		System.out.println("Samsung eject");
	}

}
