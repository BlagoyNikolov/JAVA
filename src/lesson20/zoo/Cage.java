package lesson20.zoo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Cage<T extends Animal> {
	List<T> animals;

	public Cage() {
		animals = new ArrayList<T>();
	}

	public void add(T animal) {
		animals.add(animal);
	}

	public List<T> getAnimals() {
		return animals;
	}

	public Collection<? extends Animal> cleanCage() {
		Collection<T> tmpAnimals = Collections.unmodifiableCollection(animals);
		animals = new ArrayList<T>();
		return tmpAnimals;
	}
}
