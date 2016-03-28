package lesson20.vehicles;

public class Truck implements Vehicle {
	private String model;

	public Truck(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return model;
	}
}
