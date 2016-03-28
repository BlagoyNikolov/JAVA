package lesson05;

public class Person {
	String name;
	int age;
	long personalNumber;
	boolean isWoman;
	double weight;
	Person friend;
	Person mother; 
	
	void eat() {
		System.out.println("Eating...");
	}
	
	void walk() {
		System.out.println(name + "is walking.");
	}
	
	void growUp() {
		age++;
	}
}