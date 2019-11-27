
public class Penguin extends Animal {

	public Penguin() {
		// TODO Auto-generated constructor stub
	}

	public Penguin(String name, int age, Environment environment, Employee caretaker) {
		super(name, age, environment, caretaker);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String feed() {
		// TODO Auto-generated method stub
		return "Employee feeds Penguin with fishes" ; 
	}

	@Override
	public String clean() {
		// TODO Auto-generated method stub
		return "Employee cleans the floor and water for Penguin" ; 
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "Visitor tocuhes and play with Penguin" ; 
	}

	@Override
	public String feedSnack() {
		// TODO Auto-generated method stub
		return "Visitor feed fishes and other aquatic grass to Penguin" ; 
	}

	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "Penguins beeps and moans" ; 
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return "Penguin walks on ground and swims in water" ;
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Penguin eats fishes and aquatic grass" ; 
	}

}
