package lesson10;

public interface ITVRemoteController {
	public static final int MAX_CHANNEL = 100;
	
	void startTV();
	void stopTV();
	void channelUp();
	void channelDown();
	void goToChannel(int channel);
}
