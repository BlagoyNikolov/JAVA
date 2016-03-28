package lesson20.vehicles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<Car> cars = new ArrayList<Car>();

		cars.add(new Car("Fiesta"));

		final List<Car> l = Collections.unmodifiableList(cars);
		// l.add(new Car("")); // Runtime error
		l.get(0).changeModel("320i");

		// l = new ArrayList<Car>();

		boolean b = false;

		if (b) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		System.out.println(b ? "true" : "false");
	}
}
