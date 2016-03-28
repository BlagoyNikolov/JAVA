package lesson05;

public class CarDemo {
	public static void main(String[] args) {
		Car nissan = new Car();
		nissan.model = "GT-R";
		nissan.maxSpeed = 315;
		nissan.currentSpeed = 215;
		nissan.color = "blue";
		nissan.currentGear = 2;
		nissan.owner = new Person();
		nissan.owner.name = "Galin";
		nissan.owner.age = 25;
		nissan.owner.personalNumber = 9012056785l;
		nissan.owner.isWoman = false;
		nissan.owner.weight = 80;
		
		Car BMW = new Car();
		BMW.model = "M4";
		BMW.maxSpeed = 300;
		BMW.currentSpeed = 150;
		BMW.color = "black";
		BMW.currentGear = 6;
		BMW.owner = new Person();
		BMW.owner.name = "Fiki";
		BMW.owner.age = 20;
		BMW.owner.personalNumber = 9506164896l;
		BMW.owner.isWoman = false;
		BMW.owner.weight = 100;
		
		nissan.changeGearUp();
		System.out.println("Nissan " + nissan.model + " " + nissan.currentGear);
		System.out.println("Nissan " + nissan.currentSpeed);
		nissan.accelerate();
		System.out.println("Nissan " + nissan.currentSpeed);
		
		BMW.changeGearUp();
		System.out.println("BMW " + BMW.currentGear);
		System.out.println("BMW " + BMW.currentSpeed);
		BMW.accelerate();
		System.out.println("BMW " + BMW.currentSpeed);
	}
}