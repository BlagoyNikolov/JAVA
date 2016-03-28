package lesson10.animals;

public abstract class Animal {

	private int age;
	private double weight;

	void breathe() {
		System.out.println("Breating...");
	}

	void walk() {
		System.out.println("Walking...");
	}

	abstract void makeSomeNoise();
}
