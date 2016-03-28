package lesson07;

public class Center {
	String name;
	Center (String name) {
		this.name = name;
	}
	
	Center tsarigrad = new Center("tsarigrad");
	Roads[] roads;
	City[] city;
	
	
	City sofia = new City("sofia", 42.5, 52.3);
	City plovdiv = new City("plovdiv", 49.5, 57.3);
	City pernik = new City("pernik", 40.5, 50.3);
	
	Roads sofiaPlovdiv = new Roads(sofia, plovdiv);
	Roads sofiaPernik = new Roads(sofia, pernik);
}