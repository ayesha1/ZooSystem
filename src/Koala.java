
public class Koala extends Animal {

	public Koala() {
		// TODO Auto-generated constructor stub
	}

	public Koala(String name, int age, Environment environment, Employee caretaker) {
		super(name, age, environment, caretaker);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String feed() {
		// TODO Auto-generated method stub
		return "Employee feeds Koala with gum leaves" ; 
	}

	@Override
	public String clean() {
		return "Employee cleans ground surface for Koala";
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "Visitors play with Koala by patting on the back" ; 
	}

	@Override
	public String feedSnack() {
		// TODO Auto-generated method stub
		return "Visitors feed Koala some gum leaves and other tree leaves" ; 
	}

	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "Koala says GRRHHHHHH and grunts" ; 
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return "Koala climbs up the tree and move on the branches" ; 
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Koala eats gum leaves" ; 
	}

}
