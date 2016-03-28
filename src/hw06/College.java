package hw06;

public class College {
	public static void main(String[] args) {
		Student nata = new Student("Nata", "KSI", 3.90, 4, 23, false, 900);
		Student blago = new Student("Blago", "KSI", 4.50, 3, 21, false, 150);
		Student petya = new Student("Petya", "KSI", 2.58, 2, 20, false, 190);
		Student dido = new Student("Dido", "KSI", 3.98, 6, 23, true, 550);
		Student veso = new Student ("Veso", "TE", 5.29, 5, 22, false, 350);
		Student poli = new Student ("Polina", "TE", 4.98, 2, 20, false, 190);
		Student joro = new Student("Georgi", "TE", 5.58, 3, 24, false, 940);
		
		poli.receiveScholarship(4, 110);
		petya.upYear();
		veso.upYear();
		blago.receiveScholarship(5.00, 150);
		nata.upYear();
		joro.receiveScholarship(5.00, 160);
		dido.upYear();
		
		StudentGroup groupFour = new StudentGroup("KSI");
		System.out.println("GROUP FOUR FREE PLACES " + groupFour.freePlaces);
		groupFour.addStudent(dido);
		groupFour.addStudent(blago);
		groupFour.addStudent(nata);
		groupFour.addStudent(petya);
		groupFour.theBestStudent();
		System.out.println("FREE " + groupFour.freePlaces);
		groupFour.printStudentsInGroup();
		
		StudentGroup groupFive = new StudentGroup("TE");
		System.out.println("GROUP FIVE FREE PLACES: " + groupFive.freePlaces);
		groupFive.addStudent(poli);
		groupFive.addStudent(joro);
		groupFive.addStudent(veso);
		groupFive.theBestStudent();
		System.out.println("FREE " + groupFive.freePlaces);
		groupFive.printStudentsInGroup();
		groupFive.emptyGroup();
		System.out.println("FREE " + groupFive.freePlaces);
	}
}