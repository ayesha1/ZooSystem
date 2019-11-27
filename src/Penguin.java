
public class Penguin extends Animal {

	public Penguin() {
		// TODO Auto-generated constructor stub
	}

	public Penguin(String name, int age, Environment environment, Employee caretaker) {
		super(name, age, environment, caretaker);
		// TODO Auto-generated constructor stub
	}

	
	public static String feed() {
		// TODO Auto-generated method stub
		return "Employee feeds Penguin with fishes" ; 
	}

	
	public static String clean() {
		// TODO Auto-generated method stub
		return "Employee cleans the floor and water for Penguin" ; 
	}

	
	public static String play() {
		// TODO Auto-generated method stub
		return "Visitor tocuhes and play with Penguin" ; 
	}

	
	public static String feedSnack() {
		// TODO Auto-generated method stub
		return "Visitor feed fishes and other aquatic grass to Penguin" ; 
	}

	
	public static String talk() {
		// TODO Auto-generated method stub
		return "Penguins beeps and moans" ; 
	}

	
	public static String move() {
		// TODO Auto-generated method stub
		return "Penguin walks on ground and swims in water" ;
	}

	
	public static String eat() {
		// TODO Auto-generated method stub
		return "Penguin eats fishes and aquatic grass" ; 
	}

}
