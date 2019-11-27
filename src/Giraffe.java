
public class Giraffe extends Animal {

	public Giraffe() {
		// TODO Auto-generated constructor stub
	}

	public Giraffe(String name, int age, Environment environment, Employee caretaker) {
		super(name, age, environment, caretaker);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	public static String feed() {
		return "Employee feeds Giraffe with wild apricot and shrubs" ; 
	}

	
	public static String clean() {
		return "Employee cuts weeds and cleans the ground for Giraffe" ;  
	}

	
	public static String play() {
		return "Visitor plays with Giraffe face";
	}

	
	public static String feedSnack() {
		return "Visitors feed twigs to Giraffe";
	}

	
	public static String talk() {
		return "Giraffe makes flute like noises";
	}

	
	public static String move() {
		return "Giraffe moves and runs on the ground";
	}

	
	public static String eat() {
		return "Giraffe eats twigs";
	}

}
