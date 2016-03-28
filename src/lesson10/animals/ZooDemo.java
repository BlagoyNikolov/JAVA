package lesson10.animals;

public class ZooDemo {
	public static void main(String[] args) {
		Zoo zoo = new Zoo(10);

		Dog dog = new Dog();
		Cat cat = new Cat();
		Animal maca = new Cat();

		((Cat) maca).sleep(maca);

		// !!!!!
		zoo.addAnimal(maca);
		zoo.addAnimal(dog);
		zoo.addAnimal(cat);

		maca.walk();
		//
		// zoo.walkAnimal(cat);
		// zoo.walkAnimal(dog);

		Animal[] animals = zoo.getAnimals();
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				animals[i].walk();
				animals[i].makeSomeNoise();
			}
		}

		Animal bird = new Bird();
		Bird b = (Bird) bird;
		// compilation error
		// bird.sing();
		b.sing();

		((Bird) bird).sing();

		zoo.walkAnimal(dog);
	}
}
