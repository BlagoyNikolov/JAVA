package lesson10.animals;

public class Cat extends Animal {
	void climb() {
		System.out.println("Climbing...");
	}

	@Override
	void makeSomeNoise() {
		System.out.println("Mya mya");
	}

	@Override
	void walk() {
		System.out.println("Walking like cat");
	}

	void sleep(String dream) {
		System.out.println("Dream: " + dream);
	}

	void sleep(Object dream) {
		System.out.println("Dream2: " + dream);
	}

	void sleep(Cat dream) {
		dream.walk();
		System.out.println("Dream3: ");
	}

	void sleep(Animal dream) {
		dream.walk();
		System.out.println("Dream4: ");
	}
}
