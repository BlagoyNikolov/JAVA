package lesson13.debug.carDebug;

public class CarDemo {

	public static void main(String[] args) {
		Car honda = new Car();
		honda.gear = 5;
		honda.changeGearUp();

		// Car golf = new Car(0, 6, "Black", 300);
		// golf.speed = 100;
		// golf.color = "Red";
		// golf.gear = 5;
		// golf.maxSpeed = 320.5;
		//
		// System.out.println("The current speed of the golf is " + golf.speed);
		// golf.accelerate();
		// System.out.println("The current speed of the golf is " + golf.speed);
		//
		// System.out.println("The current gear is " + golf.gear);
		// for (int i = 0; i < 10; i++) {
		// golf.changeGearUp();
		// }
		//
		// System.out.println("The current gear is " + golf.gear);
		//
		// System.out.println("The Honda's current gear is " + honda.gear);
		// honda.changeGear(1);
		// System.out.println("The Honda's current gear is " + honda.gear);
		//
		// golf.changeColor("Blue");
		// golf.changeColor("Red");
	}

}
