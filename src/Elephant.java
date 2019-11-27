
public class Elephant extends Animal {

	public Elephant() {
		// TODO Auto-generated constructor stub
	}

	public Elephant(String name, int age, Environment environment, Employee caretaker) {
		super(name, age, environment, caretaker);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public static String feed() {
		
		return "Employee feeds Elephant with fruits and bushes" ; 
	}

	
	public static String clean() {
		return "Employee cleans water body for Elephant";
	}

	
	public static String play() {
		return "Visitors ride on Elephant back";
	}

	
	public static String feedSnack() {
		return "Visitors feed Elephant with fruits and bushes";
	}

	
	public static String talk() {
		return "Elephant makes squeaking and roaring sounds" ;
	}

	
	public static String move() {
		return "Elephant moves in and out of the water";
	}

	
	public static String eat() {
		return "Elephant eats furits and bushes";
	}

}
