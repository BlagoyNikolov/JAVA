package lesson15;

public class Car {

	private String model;
	private int year;

	public Car(String model, int year) {
		this.model = model;
		this.year = year;
	}

	@Override
	public String toString() {
		return model + ", year: " + year;
	}

	public void startEngine() {
		System.out.println("Starting engine of " + model);
	}
}
