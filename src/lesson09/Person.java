package lesson09;

public class Person {
	String name;
	int age;
	long personalNumber;
	boolean isMale;
	double weight;
	Person friends[];
	Person mother; 
	
	Person () {
		
	}
	
	Person(int age, double weight) {
		this.age = 0;
		this.weight = 4.0;
	}
	
	Person(String name, long personalNumber,boolean isMale, int friendsNumber) {
		this();
		this.name = name;
		this.personalNumber = personalNumber;
		this.isMale = isMale;
		this.friends = new Person[friendsNumber];
		
	}
	
	int getFriendsNumber() {
		return friends.length;
	}
	
	Person[] getFriends() {
		return friends;
	}
	
	void eat() {
		System.out.println("Eating...");
	}
	
	void walk() {
		System.out.println(name + "is walking.");
	}
	
	void growUp() {
		age++;
	}
	
	void print() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + personalNumber);
		System.out.println("isMale: " + isMale);
		System.out.println("Friends: " + getFriendsNumber());
	}
}