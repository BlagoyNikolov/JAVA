package hw08;

public class GSMTest {
	public static void main(String[] args) {
		GSM nexus = new GSM ("Google Nexus 4");
		GSM asha = new GSM ("Nokia Asha 302");
		
		nexus.insertSimCard("0888720060");
		asha.insertSimCard("0888654987");
		
		//nexus.removeSimCard();
		//asha.removeSimCard();
		
		nexus.call(asha, 18);
		//nexus.call(asha, 58);
		
		asha.call(nexus, 54);
		//asha.call(nexus, 17);
	
		nexus.printInfoForTheLastOutgoingCall();
		nexus.printInfoForTheLastIncomingCall();
		
		asha.printInfoForTheLastOutgoingCall();
		asha.printInfoForTheLastIncomingCall();
		
		nexus.getSumForCall();
		asha.getSumForCall();
	}
}
