package hw07;

public class Demo {
	public static void main(String[] args) {
		Task project = new Task("Project", 7);
		Task presentation = new Task("Presentation", 6);
		Task test = new Task("Test", 18);
		Task mazalqk = new Task("Mazalqk", 8);
		
		Employee blago = new Employee("Blagoy", project, 4);
		Employee nata = new Employee("Natalie", presentation, 8);
		Employee dido = new Employee("Deyan", test, 5);
		Employee petq = new Employee("", mazalqk, -5);
		
		blago.work();
		nata.work();
		dido.work();
		petq.work();
		
		blago.showReport();
		nata.showReport();
		dido.showReport();
		petq.showReport();
		
		petq.setHoursLeft(-4);
		petq.setName("");
	}
}