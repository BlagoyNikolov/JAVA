package hw09;

public class Student extends Person {
	private double score;
	
	Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		setScore(score);
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	public void showStudentInfo() {
		showPersonInfo();
		System.out.println("Score: " + getScore());
	}
}