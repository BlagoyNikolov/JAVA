package lesson09;

public class Car {
	String model;
	double maxSpeed;
	double currentSpeed;
	int currentGear;
	int numberOfDoors;
	int idNumber;
	boolean isSportCar;
	Person owner;
	String color;
	double price;
	
	Car () {
		
	}
	
	Car (String text) {
		this ();
		//System.out.println(this);
	}
	
//	Car (int model) {
//		this ();
//		System.out.println(this);
//	}
	
	Car (String model, boolean isSportCar,String color) {
		this(model);
		this.model = model;
		this.isSportCar = isSportCar;
		this.color = color;
		this.currentGear = 1;
		this.currentSpeed = 10;
	}
	
	Car (String model, boolean isSportCar,String color, double price, double maxSpeed) {
		this(model, isSportCar, color);

		this.price = price;
		this.maxSpeed = maxSpeed;

		if(maxSpeed < 200 || (isSportCar == true)) {
			this.maxSpeed = maxSpeed;
		}
	}
	
	double calculateCarPriceForScrap(double metalPrice) {
		double coef = 0.2;
		if ((this.color.equals("Black")) || (this.color.equals("White"))) {
			coef = coef + 0.05;
		}
		if (this.isSportCar = true) {
			coef = coef + 0.05;
		}
		System.out.println(metalPrice * coef);
		return metalPrice * coef;
	}
	
	boolean isMoreExpensive(Car car) {
		return (this.price > car.price);
	}
	
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
	
	void startEngine() {
		System.out.println("STARTING ENGINE...");
	}
	
	void changeOwner(Person newOwner) {
		owner = newOwner;
	}
	
	void openDoors() {
		System.out.println("OPENING DOORS...");
	}
	
	void stop() {
		currentSpeed = 0;
	}
	
	void print() {
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
		System.out.println("Price: " + price);
		System.out.println("Current speed: " + currentSpeed);
		System.out.println("MAX speed: " + maxSpeed);
	}
	@Override
	public String toString(){
		return "Price: " + price;
		
	}
}