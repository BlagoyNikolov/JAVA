package hw06;

public class Student {
	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;
	
	Student () {
		grade = 4.0;
		yearInCollege = 1;
		isDegree = false;
		money = 150;
	}
	
	Student (String name, String subject, int i) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = i;
	}
	
	Student (String name, String subject, double grade, int yearInCollege, int age, boolean isDegree, double money) {
		this.name = name;
		this.subject = subject;
		this.grade = grade;
		this.yearInCollege = yearInCollege;
		this.age = age;
		this.isDegree = isDegree;
		this.money = money;
	}
	
	void upYear() {
		if (this.yearInCollege < 4) {
			this.yearInCollege++;
		} else {
			//System.out.println("The student has graduated");
			this.isDegree = true;
		}
	}
	
	double receiveScholarship(double min, double amount) {
		if (this.grade >= min && this.age <= 30) {
			this.money += amount;
		}
		return this.money;
	}
}