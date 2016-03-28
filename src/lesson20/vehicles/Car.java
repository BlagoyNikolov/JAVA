package lesson20.vehicles;

public class Car implements Vehicle {
	private String model;

	public Car(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return model;
	}

	public void changeModel(String model) {
		this.model = model;
	}
}
