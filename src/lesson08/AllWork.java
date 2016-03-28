package lesson08;

public class AllWork {
	public static int PLACES_FOR_TASKS = 10;

	private Task[] tasks;
	private int freePlacesForTasks;
	// the index of the current unassigned task
	private int currentUnassignedTask;

	public AllWork() {
		tasks = new Task[PLACES_FOR_TASKS];
		freePlacesForTasks = PLACES_FOR_TASKS;
		currentUnassignedTask = 0;
	}

	public void addTask(Task taskToAdd) {
		if (taskToAdd == null) {
			System.out.println("Not valid task!");
			return;
		}

		if (freePlacesForTasks == 0) {
			System.out.println("No place for new tasks");
			return;
		}

		tasks[tasks.length - freePlacesForTasks--] = taskToAdd;
		System.out.println(taskToAdd.getName() + " has been added");
	}

	public Task getNextTask() {
		if (currentUnassignedTask >= tasks.length) {
			return null;
		}

		return tasks[currentUnassignedTask++];
	}

	public boolean isAllWorkDone() {
		for (int i = 0; i < tasks.length - freePlacesForTasks; i++) {
			if (tasks[i].getWorkingHours() > 0) {
				return false;
			}
		}

		return true;
	}
}
