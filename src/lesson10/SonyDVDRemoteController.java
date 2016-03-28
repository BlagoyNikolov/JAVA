package lesson10;

public class SonyDVDRemoteController implements IDVDRemoteController {
	public void play() {
		System.out.println("Sony. Starting movie...");
	}
	
	public void stop() {
		System.out.println("Sony. Stopping movie...");
	}
	
	public void insertDisc() {
		System.out.println("Sony. Inserting disc...");
	}
	
	public void eject() {
		System.out.println("Sony. Removing the disc...");
	}
	
}
