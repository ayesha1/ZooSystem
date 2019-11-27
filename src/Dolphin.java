
public class Dolphin extends Animal {

	public Dolphin() {
		// TODO Auto-generated constructor stub
	}
	
	public Dolphin(String name, int age, Environment environment, Employee caretaker) {
		super(name, age, environment, caretaker);
		// TODO Auto-generated constructor stub
	}
	
	
	public static String feed() {
		return "Employee feeds Dolphin with herring fishes" ; 
	}

	
	public static String clean() {
		return "Employee cleans water for Dolphin";
	}

	
	public static String play() {
		return "Visitors play hit the ball with Dolphin" ;
	}

	
	public static String feedSnack() {
		return "Visitors feeds dolphin some fishes";
	}

	
	public static String talk() {
		return "Dolphin says EIIIIIIIHHHH";
	}

	
	public static String move() {
		return "Dolphin swims in the water and moves up in the water";
	}

	
	public static String eat() {
		return "Dolphin eats herring fishes and cod" ;
	}
}
