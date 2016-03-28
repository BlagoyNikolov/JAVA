package lesson08;

public class OfficeDemo {
	public static void main(String[] args) {
		AllWork allWork = new AllWork();

		for (int i = 1; i <= 10; i++) {
			Task task = new Task("Task " + i, i * i);
			allWork.addTask(task);
		}

		Employee.setAllWork(allWork);

		Employee[] employees = { new Employee("Pesho"), new Employee("Ani"),
				new Employee("Ahmed \"The Dead Terrorist\"") };

		int day = 1;
		while (true) {
			System.out
					.println("_______________ day " + day + "_______________");

			if (Employee.getAllWork().isAllWorkDone()) {
				System.out.println("The work is done :)");
				break;
			}

			for (int i = 0; i < employees.length; i++) {
				employees[i].startWorkingDay();
				employees[i].work();
			}

			day++;
		}
	}
}
