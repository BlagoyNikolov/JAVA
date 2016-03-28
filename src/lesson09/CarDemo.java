package lesson09;

public class CarDemo {
	public static void main(String[] args) {
		Car GTR = new Car("GT-R", true, "black", 190000, 325);
		Car M4 = new Car("M4", true, "blue", 155000, 310);
		SportCar RS6 = new SportCar();
		Jeep Cherokee = new Jeep();
		Bus Connecto = new Bus();

		RS6.switchTurbo();
		RS6.print();

		Cherokee.switch4x4();
		Cherokee.stop();
		Cherokee.driveOffRoad();
		Cherokee.print();

		Connecto.startEngine();
		Connecto.Course();
		Connecto.print();

		GTR.print();
		System.out.println(GTR.toString());

	}
}
