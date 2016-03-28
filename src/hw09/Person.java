package hw09;

public class Person {
	private String name;
	private int age;
	private boolean isMale;
	
	Person(String name, int age, boolean isMale) {
		setName(name);
		setAge(age);
		setMale(isMale);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	public void showPersonInfo() {
		System.out.println("----------------------------------------------------");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: Male: " + isMale);
	}
}