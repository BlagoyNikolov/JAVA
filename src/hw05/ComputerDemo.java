package hw05;

import java.util.Scanner;

public class ComputerDemo {
	public static void main(String[] args) {
//		Scanner OS = new Scanner(System.in);
//		String newOperatingSystem = OS.next();
		
		Computer lenovo = new Computer();
		lenovo.year = 2014;
		lenovo.price = 1070;
		lenovo.isNotebook = true;
		lenovo.hardDiskMemory = 960;
		lenovo.freeMemory = 890;
		lenovo.operatingSystem = "Windows 8.1";
		//String newOperatingSystem = "Windows 10";
		
		Computer desktop = new Computer();
		desktop.year = 2010;
		desktop.price = 950;
		desktop.isNotebook = false;
		desktop.hardDiskMemory = 930;
		desktop.freeMemory = 425;
		desktop.operatingSystem = "Windows 10";
		
		System.out.println("Lenovo: Year: " + lenovo.year + " Price: " + lenovo.price + " lv. Notebook: " + lenovo.isNotebook + " HDD: " + lenovo.hardDiskMemory + " GB FreeMEM: " + lenovo.freeMemory + " GB OS: " + lenovo.operatingSystem);
		System.out.println("Desktop: Year: " + desktop.year + " Price: " + desktop.price + " lv. Notebook: " + desktop.isNotebook + " HDD: " + desktop.hardDiskMemory + " GB FreeMEM: " + desktop.freeMemory + " GB OS: " + desktop.operatingSystem);
		
		System.out.println("Select a new operating system for your Lenovo: ");
		Scanner computer = new Scanner(System.in);
		String newOperatingSystem = computer.nextLine();
		lenovo.changeOperationSystem(newOperatingSystem);
		System.out.println("Lenovo: " + lenovo.operatingSystem);
		
		System.out.println("Allocate memory on your Desktop: ");
		double memory = computer.nextDouble();
		computer.close();
		desktop.useMemory(memory);
		System.out.println("Desktop free memory: " + desktop.freeMemory + " GB");
		
		System.out.println("Computers after changes:");
		System.out.println("Lenovo: Year: " + lenovo.year + " Price: " + lenovo.price + " lv. Notebook: " + lenovo.isNotebook + " HDD: " + lenovo.hardDiskMemory + " GB FreeMEM: " + lenovo.freeMemory + " GB OS: " + lenovo.operatingSystem);
		System.out.println("Desktop: Year: " + desktop.year + " Price: " + desktop.price + " lv. Notebook: " + desktop.isNotebook + " HDD: " + desktop.hardDiskMemory + " GB FreeMEM: " + desktop.freeMemory + " GB OS: " + desktop.operatingSystem);
	}
}