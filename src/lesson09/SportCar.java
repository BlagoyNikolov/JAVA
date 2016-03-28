package lesson09;

public class SportCar extends Car {
	boolean isCabriolet;
	double price;
	
	void switchTurbo() {
		startEngine();
		changeGearUp();;
		accelerate();
		System.out.println("TURNING ON ANTI LAG TURBO INDUCTION SYSTEM");
	}
	
	@Override
	void print() {
		System.out.println("Price: " + price);
		System.out.println("Current speed: " + currentSpeed);
		System.out.println("MAX speed: " + maxSpeed);
	}
	@Override
	public String toString(){
		return "Price: " + price;
		
	}
}
