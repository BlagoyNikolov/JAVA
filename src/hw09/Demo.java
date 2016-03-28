package hw09;

public class Demo {
	public static void main(String[] args) {
		Person[] people = new Person[20];
		people[0] = new Person("api1", 29, true);
		people[1] = new Person("api1.1", 20, true);
		people[2] = new Person("cupcake", 31, true);
		people[3] = new Person("donut", 40, true);
		people[4] = new Person("eclair", 37, true);
		people[5] = new Person("froyo", 19, true);
		people[6] = new Person("gingerbread", 14, true);
		people[7] = new Person("honeycomb", 25, true);
		people[8] = new Person("icecreamsandwich", 23, true);
		people[9] = new Person("jellybean", 64, true);
		
		Person blago = new Person("Blagoy", 21, true);
		Person nata = new Person("Nata", 21, false);
		
		Student dido = new Student("Deyan", 20, true, 4.5);
		Student petq = new Student("Petya", 20, false, 3.5);
		
		Employee veso = new Employee("Veso", 18, true, 550);
		Employee deso = new Employee("Deso", 17, true, 850);
		Employee ahmed = new Employee("Ahmed", 50, false, 1000);
		
		people[10] = blago;
		people[11] = nata;
		people[12] = dido;
		people[13] = petq;
		people[14] = veso;
		people[15] = deso;
		people[16] = ahmed;
		
		for (int i = 0; i < people.length; i++) {
			if (people[i] instanceof Student ) {
				((Student) people[i]).showStudentInfo();
			} else if (people[i] instanceof Employee ) {
				((Employee) people[i]).showEmployeeInfo();
			} else if (people[i] instanceof Person ){
				(people[i]).showPersonInfo();	
			}
		}
		
		for (int i = 0; i < people.length; i++) {
			if(people[i] instanceof Employee ) {
				((Employee) people[i]).calculateOvertime(2);
			}
		}
	}
}