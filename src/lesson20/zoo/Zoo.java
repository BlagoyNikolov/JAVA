package lesson20.zoo;

public class Zoo {
	public static void main(String[] args) {
		Cage<Mammal> mammals = new Cage<>();
		Cage<Bird> birds = new Cage<>();

		Mammal lion = new Mammal();
		Bird eagle = new Bird();

		mammals.add(lion);
		birds.add(eagle);

		Cage<Animal> animals = new Cage<Animal>();
		animals.add(lion);
		animals.add(eagle);

		for (Animal temp : birds.getAnimals()) {
			temp.print();
		}

		// Cage<Car> cars = new Cage<Car>(); // Compile time error after <T
		// extends Animal>
	}
}
