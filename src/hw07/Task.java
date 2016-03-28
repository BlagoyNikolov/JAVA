package hw07;

public class Task {
	private String name;
	private int workingHours;
	
	Task (String name, int workingHours) {
		this.name = name;
		this.workingHours = workingHours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}
	
}