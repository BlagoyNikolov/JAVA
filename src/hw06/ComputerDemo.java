package hw06;

public class ComputerDemo {
	public static void main(String[] args) {
		Computer lenovo = new Computer(2014, 1070, true, 960, 890, "Windows 8.1");
		Computer desktop = new Computer(2010, 1070, false, 930, 425, "Windows 10");
		Computer nexus4 = new Computer(2012, 670, false, 16, 5, "Android 5.1");
		
		lenovo.print();
		desktop.print();
		nexus4.print();
		
		lenovo.comparePrice(nexus4);
		lenovo.comparePrice(desktop);
		
		desktop.comparePrice(lenovo);
		desktop.comparePrice(nexus4);
		
		nexus4.comparePrice(lenovo);
		nexus4.comparePrice(desktop);
		
//		System.out.println("Select a new operating system for your Lenovo: ");
//		lenovo.changeOperationSystem(newOperatingSystem);
//		
		double memory = 100;
		desktop.useMemory(memory);
		
//		System.out.println("Computers after changes:");
//		System.out.println("Lenovo: Year: " + lenovo.year + " Price: " + lenovo.price + " lv. Notebook: " + lenovo.isNotebook + " HDD: " + lenovo.hardDiskMemory + " GB FreeMEM: " + lenovo.freeMemory + " GB OS: " + lenovo.operatingSystem);
//		System.out.println("Desktop: Year: " + desktop.year + " Price: " + desktop.price + " lv. Notebook: " + desktop.isNotebook + " HDD: " + desktop.hardDiskMemory + " GB FreeMEM: " + desktop.freeMemory + " GB OS: " + desktop.operatingSystem);
	}
}