package hw06;

public class StudentGroup {
	String groupSubject;
	Student [] students;
	int freePlaces;
	
	StudentGroup(String subject, Student[] students, int freePlaces) {
		this.groupSubject = subject;
		this.students = students;
		this.freePlaces = freePlaces;
	}
	
	StudentGroup() {
		students = new Student[5];
		freePlaces = 5;
	}
	
	StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
	}
	
	void addStudent(Student s) {
		if(this.freePlaces > 0 && this.groupSubject.equals(s.subject)) {
			for(int i = 0; i < 5; i++) {
				if(students[i] == null){
				students[i] = s;
				freePlaces--;
				break;
				}
			}
		}
	}
	
	void emptyGroup() {
		for(int i = 0; i < 5; i++) {
			students[i] = null;
		}
		System.out.println("The group has been closed");
		freePlaces = 5;
	}
	
	String theBestStudent() {
		String theBestStudent = students[0].name;
		for (int i = 0; i < students.length - 1; i++) {
			if (students[i + 1] == null) {
				break;
			}
			if (students[i].grade < students[i + 1].grade) {
				theBestStudent = students[i + 1].name;
			}
		}
		System.out.println("The student with the best grade is: " + theBestStudent);
		return theBestStudent;
	}
	
	void printStudentsInGroup() {
		for(int i = 0; i < 5; i++) {
			if (students[i] == null) {
				break;
			}
			System.out.println("Name: " + students[i].name);
			System.out.println("Subject: " + students[i].subject);
			System.out.println("Year in college: " + students[i].yearInCollege);
			System.out.println("Age: " + students[i].age);
			System.out.println("Graduated: " + students[i].isDegree);
			System.out.println("Balance: " + students[i].money);
			System.out.println("Group Subject: " + groupSubject);
		}
	}
}