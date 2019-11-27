
public class Dolphin extends Animal {

	public Dolphin() {
		// TODO Auto-generated constructor stub
	}
	
	public Dolphin(String name, int age, Environment environment, Employee caretaker) {
		super(name, age, environment, caretaker);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String feed() {
		return "Employee feeds Dolphin with herring fishes" ; 
	}

	@Override
	public String clean() {
		return "Employee cleans water for Dolphin";
	}

	@Override
	public String play() {
		return "Visitors play hit the ball with Dolphin" ;
	}

	@Override
	public String feedSnack() {
		return "Visitors feeds dolphin some fishes";
	}

	@Override
	public String talk() {
		return "Dolphin says EIIIIIIIHHHH";
	}

	@Override
	public String move() {
		return "Dolphin swims in the water and moves up in the water";
	}

	@Override
	public String eat() {
		return "Dolphin eats herring fishes and cod" ;
	}
}
