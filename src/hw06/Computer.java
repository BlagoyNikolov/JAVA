package hw06;

public class Computer {
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operatingSystem;
	String newOperatingSystem;
	double memory;
	
	Computer () {
		isNotebook = false;
		operatingSystem = "Win XP";
	}
	
	Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}
	
	Computer(int year, double price, boolean isNotebook,double hardDiskMemory, double freeMemory, String operatingSystem) {
		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operatingSystem = operatingSystem;
	}
	
	int comparePrice(Computer c) {
		if (this.price == c.price) {
			System.out.println("The prices are equal");
			return 0;
		} else {
			if (this.price > c.price) {
				System.out.println("The first device is more expensive");
				return -1;
			} else {
				System.out.println("The second device is more expensive");
				return 1;
			}
		}
	}
	
	void print () {
		System.out.println("Year: " + year + " Price: " + price + " lv. Notebook: " + isNotebook + " HDD: " + hardDiskMemory + " GB FreeMEM: " + freeMemory + " GB OS: " + operatingSystem);
	}
	
	void changeOperationSystem(String newOperatingSystem) {
		operatingSystem = newOperatingSystem;
	}
	
	void useMemory(double memory) {
		if (memory < freeMemory) {
			freeMemory = freeMemory - memory;
		} else {
			System.out.println("Not enough free memory!");
		}
	}
}