
public class Gorilla extends Animal {

	public Gorilla() {
		// TODO Auto-generated constructor stub
	}

	public Gorilla(String name, int age, Environment environment, Employee caretaker) {
		super(name, age, environment, caretaker);
		// TODO Auto-generated constructor stub
	}

	
	
	
	@Override
	public String feed() {
		return "Employee feeds Gorilla with banana and fruits";
	}

	@Override
	public String clean() {
		return "Employee cleans the cage area and shelter for Gorilla";
	}

	@Override
	public String play() {
		return "Visitors shake hands with Gorilla";
	}

	@Override
	public String feedSnack() {
		return "Visitors feed Gorilla with watermelon and banana";
	}

	@Override
	public String talk() {
		return "Gorilla makes human like loud noises and says OOOOOUUUUUHHHH";
	}

	@Override
	public String move() {
		return "Gorilla climbs up the tree";
	}

	@Override
	public String eat() {
		return "Gorilla eats fruits like banana and watermelon";
	}

}
