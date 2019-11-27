
public class Camel extends Animal {

	public Camel() {
		// TODO Auto-generated constructor stub
	}

	public Camel(String name, int age, Environment environment, Employee caretaker) {
		super(name, age, environment, caretaker);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String feed() {
		return "Employee feeds camel with grass" ; 
	}

	@Override
	public String clean() {
		return "Employee cleans sand for the camel" ; 
	}

	@Override
	public String play() {
		return "Visitors rides camel back" ; 
	}

	@Override
	public String feedSnack() {
		return "Visitors feed camel with bushes and grass" ; 
	}

	@Override
	public String talk() {
		return "Camel says EOOOOUUUUUHHHHHHH" ; 
	}

	@Override
	public String move() {
		return "Camel moves in the sand" ; 
	}

	@Override
	public String eat() {
		return "Camel eats grass and bushes";
	}

}
