 package hw09;

public class Employee extends Person {
	private double daySalary;

	Employee(String name, int age, boolean isMale, int daySalary) {
		super(name, age, isMale);
		setDaySalary(daySalary);
	}

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(int daySalary) {
		this.daySalary = daySalary;
	}
	
	public double calculateOvertime(double hours) {
		double overtime = 0;
		System.out.println("----------------------------------------------------");
		if (getAge() < 18) {
			System.out.println(getName() + ": " + hours + " HOURS OVERTIME: PERSON IS NOT 18: " + overtime +" $");
			return overtime;
		} else {
			overtime = ((daySalary/24) * 1.5) * hours;
			System.out.println(getName() + ": " + hours + " HOURS OVERTIME: " + overtime +" $");
			return overtime;
		}
	}
	
	public void showEmployeeInfo() {
		showPersonInfo();
		System.out.println("Salary: " + getDaySalary());
	}
}
