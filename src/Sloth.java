
public class Sloth extends Animal {

	public Sloth() {
		// TODO Auto-generated constructor stub
	}

	public Sloth(String name, int age, Environment environment, Employee caretaker) {
		super(name, age, environment, caretaker);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String feed() {
		// TODO Auto-generated method stub
		return "Employee feeds sloth with dead and alive insects" ; 
	}

	@Override
	public String clean() {
		// TODO Auto-generated method stub
		return "Employee clears and cuts tree branches for sloth" ; 
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "Visitor play with sloth by picking them up from behind" ; 
	@Override
	public String feedSnack() {
		// TODO Auto-generated method stub
		return "Visitor feeds sloth with insects" ; 
	}

	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "Sloth makes squeaky noises" ; 
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return "Sloth climbs up the tree and hanges upside down" ; 
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Sloth eats live as well as dead insects" ; 
	}

}
