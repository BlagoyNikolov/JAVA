package hw05;

public class Computer {
	short year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operatingSystem;
	String newOperatingSystem;
	double memory;
	
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