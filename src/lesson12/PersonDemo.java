package lesson12;

public class PersonDemo {
	public static void main(String[] args) {
		Person john = new Person();
		// john.setAge(-12);
		Person johnie = new Person("Johnie");

		john.hasTheSameName(johnie);
	}
}
