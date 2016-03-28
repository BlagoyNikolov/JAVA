package lesson20.autoBoxing;

import lesson20.vehicles.Car;

public class FloatDemo {
	public static void main(String[] args) {
		float f = 2.7F;
		Float fl = new Float(3.5);

		System.out.println(f);
		System.out.println(fl);
		f++;
		fl++;
		System.out.println(f);
		System.out.println(fl);

		Car car = new Car("A180");
		// car++;

		Float f2 = 2.7F;
		float f3 = new Float(2.7);

		System.out.println(f2 == f3);
	}
}
