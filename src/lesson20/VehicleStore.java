package lesson20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import lesson20.vehicles.Vehicle;

public class VehicleStore<T extends Vehicle> {
	private List<T> vehicles;

	public VehicleStore() {
		vehicles = new ArrayList<T>();
	}

	public void add(T vehicle) {
		vehicles.add(vehicle);
	}

	public T getFirst() {
		T vehicle = vehicles.get(0);
		if (vehicle != null) {
			vehicles.remove(0);
		}

		return vehicle;
	}

	public Collection<T> getAll() {
		return Collections.unmodifiableCollection(vehicles);
	}

}
