package lesson10.animals;

public class Bird extends Animal{
	double flyingSpeed;
	
	void fly(){
		System.out.println("Flying...");
	}

	@Override
	void makeSomeNoise() {
		System.out.println("Piu piu");
	}
	
	void sing() {
		System.out.println("Singing...");
	}
}
