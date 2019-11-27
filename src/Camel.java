
public class Camel extends Animal {

	public Camel() {
		// TODO Auto-generated constructor stub
	}

	public Camel(String name, int age, Environment environment, Employee caretaker) {
		super(name, age, environment, caretaker);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public static String feed() {
		return "Employee feeds camel with grass" ; 
	}

	
	public static String clean() {
		return "Employee cleans sand for the camel" ; 
	}

	
	public static String play() {
		return "Visitors rides camel back" ; 
	}

	
	public static String feedSnack() {
		return "Visitors feed camel with bushes and grass" ; 
	}

	
	public static String talk() {
		return "Camel says EOOOOUUUUUHHHHHHH" ; 
	}

	
	public static String move() {
		return "Camel moves in the sand" ; 
	}

	
	public static String eat() {
		return "Camel eats grass and bushes";
	}

}
