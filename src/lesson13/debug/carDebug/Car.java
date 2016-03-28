package lesson13.debug.carDebug;

public class Car {
	double speed;
	int gear;
	String color;
	double maxSpeed;
	
//	public Car(){
//		
//	}
//	
//	public Car(double speed, int gear, String color, double maxSpeed) {
//		this.speed = speed;
//		this.gear = gear;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	}

	void accelerate() {
		speed = speed + 10.5;
	}

	void changeGearUp() {
		gear++;
	}
	
	void changeGearDown() {
		gear--;
	}
	
	void changeGear(int nextGear) {
		gear = nextGear;
	}
	
	void changeColor(String newColor) {
		color = newColor;
	}
}
