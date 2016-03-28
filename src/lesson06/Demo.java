package lesson06;

public class Demo {
	public static void main(String[] args) {
		Car bmw = new Car("BMW", true, "Black", 23400, 234);
		Car mercedes = new Car("Mercedes", true, "Red", 19000, 190);
		Car audi = new Car("Audi", false, "White", 15000, 150);
		
		bmw.print();
		System.out.println(bmw.isMoreExpensive(audi));
		System.out.println(bmw.isMoreExpensive(mercedes));
		bmw.calculateCarPriceForScrap(15.5);
		
		mercedes.print();
		System.out.println(mercedes.isMoreExpensive(audi));
		System.out.println(mercedes.isMoreExpensive(bmw));
		mercedes.calculateCarPriceForScrap(16.5);
		
		audi.print();
		System.out.println(audi.isMoreExpensive(mercedes));
		System.out.println(audi.isMoreExpensive(bmw));
		audi.calculateCarPriceForScrap(14.5);
		
		
		Person nata = new Person("natali", 984984123, false, 15);
		Person dido = new Person("deian", 984984124, false, 42);
		Person petq = new Person("petya", 984984125, false, 25);
		
		nata.print();
		dido.print();
		petq.print();
		
	}
}
