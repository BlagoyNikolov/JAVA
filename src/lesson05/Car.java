package lesson05;

public class Car {
	String model;
	int maxSpeed;
	int currentSpeed;
	String color;
	int currentGear;
	Person owner;

	void accelerate() {
		currentSpeed++;
	}

	void changeGearUp() {
		if (currentGear < 5) {
			currentGear++;
		} else {
			System.out.println("MAX GEAR");
		}
	}

	void changeGearDown() {
		if (currentGear > 0) {
			currentGear--;
		}
	}

	void changeGear(int nextGear) {
		if (nextGear >= 1 && nextGear <= 5) {
			currentGear = nextGear;
		}
	}

	void changeColor(String newColor) {
		color = newColor;
	}
}