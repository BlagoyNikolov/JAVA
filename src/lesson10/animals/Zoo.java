package lesson10.animals;

public class Zoo {
	private Animal[] animals;

	public Zoo(int cages) {
		animals = new Animal[cages];
	}

	void addAnimal(Animal newAnimal) {
		// add the animal to the array
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null) {
				animals[i] = newAnimal;
				return;
			}
		}
		System.out.println("No free cages for more animals");
	}

	void walkAnimal(Animal animal) {
		animal.walk();
		if (animal instanceof Bird) {
			((Bird) animal).sing();
		}
		// ((Bird)animal).sing();
	}

	public Animal[] getAnimals() {
		return animals;
	}
}
