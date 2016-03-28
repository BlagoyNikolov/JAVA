package lesson10.animals;

public class Dog extends Animal {
	boolean isDangerous;
	
	void bringStick() {
		System.out.println("Bringing the stick...");
	}
	
	void makeSomeNoise() {
		System.out.println("Bau bau");
	}
	
	@Override
	void walk() {
		System.out.println("Walking like a dog...");
	}
}
