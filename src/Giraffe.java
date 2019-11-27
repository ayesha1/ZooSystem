
public class Giraffe extends Animal {

	public Giraffe() {
		// TODO Auto-generated constructor stub
	}

	public Giraffe(String name, int age, Environment environment, Employee caretaker) {
		super(name, age, environment, caretaker);
		// TODO Auto-generated constructor stub
	}

	
	
	
	@Override
	public String feed() {
		return "Employee feeds Giraffe with wild apricot and shrubs" ; 
	}

	@Override
	public String clean() {
		return "Employee cuts weeds and cleans the ground for Giraffe" ;  
	}

	@Override
	public String play() {
		return "Visitor plays with Giraffe face";
	}

	@Override
	public String feedSnack() {
		return "Visitors feed twigs to Giraffe";
	}

	@Override
	public String talk() {
		return "Giraffe makes flute like noises";
	}

	@Override
	public String move() {
		return "Giraffe moves and runs on the ground";
	}

	@Override
	public String eat() {
		return "Giraffe eats twigs";
	}

}
