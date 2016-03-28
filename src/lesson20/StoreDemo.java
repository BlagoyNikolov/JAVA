package lesson20;

import lesson20.vehicles.Car;
import lesson20.vehicles.Truck;
import lesson20.vehicles.Vehicle;

public class StoreDemo {
	public static void main(String[] args) {
		VehicleStore<Car> carStore = new VehicleStore<Car>();
		Car bmw = new Car("320i");
		Car merc = new Car("E320");
		Truck ford = new Truck("F150");

		carStore.add(bmw);
		carStore.add(merc);
		// carStore.add(ford); Compile time error

		Car c = carStore.getFirst(); // Correct
		// Truck t = carStore.getFirst(); Compiletime error

		for (Car o : carStore.getAll()) {
			System.out.println(o);
		}

		System.out.println("==========");

		VehicleStore<Vehicle> vehicleStore = new VehicleStore<>();

		vehicleStore.add(ford);
		vehicleStore.add(bmw);

		// Compile time error after <T extends Vehicle>
		// VehicleStore<Animal> vs = new VehicleStore<Animal>();
		// vs.add(new Bird());
	}
}
