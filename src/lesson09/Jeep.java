package lesson09;

public class Jeep extends Car {
	void switch4x4() {
		startEngine();
		accelerate();
		System.out.println("4X4 ACTIVATED");
	}
	
	void driveOffRoad() {
		accelerate();
		changeGearUp();
		switch4x4();
		System.out.println("DRIVING OFFROAD");
	}
}
