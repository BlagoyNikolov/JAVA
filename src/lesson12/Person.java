package lesson12;

public class Person {
	private String name;
	private int age;

	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		} else {
			// !!!!!!!!!!!!!!
			throw new IllegalArgumentException("Wrong age param: " + age);
		}
	}

	public boolean hasTheSameName(Person p) {
		return this.name.equals(p.name);
	}
}
