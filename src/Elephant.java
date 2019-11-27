
public class Elephant extends Animal {

	public Elephant() {
		// TODO Auto-generated constructor stub
	}

	public Elephant(String name, int age, Environment environment, Employee caretaker) {
		super(name, age, environment, caretaker);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String feed() {
		
		return "Employee feeds Elephant with fruits and bushes" ; 
	}

	@Override
	public String clean() {
		return "Employee cleans water body for Elephant";
	}

	@Override
	public String play() {
		return "Visitors ride on Elephant back";
	}

	@Override
	public String feedSnack() {
		return "Visitors feed Elephant with fruits and bushes";
	}

	@Override
	public String talk() {
		return "Elephant makes squeaking and roaring sounds" ;
	}

	@Override
	public String move() {
		return "Elephant moves in and out of the water";
	}

	@Override
	public String eat() {
		return "Elephant eats furits and bushes";
	}

}
