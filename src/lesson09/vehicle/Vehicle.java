package lesson09.vehicle;

public class Vehicle {
	private String model;
	private double speed;
	private String fuel;
	private double cargoSpace;
	private int seats;
	
	public Vehicle() {
		setModel("default model");
		setSpeed(0);
		setFuel("diesel");
		setCargoSpace(0);
		setSeats(0);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public double getCargoSpace() {
		return cargoSpace;
	}

	public void setCargoSpace(double cargoSpace) {
		this.cargoSpace = cargoSpace;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
	
}
