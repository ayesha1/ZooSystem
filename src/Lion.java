
public class Lion extends Animal {

	public Lion() {
		// TODO Auto-generated constructor stub
	}

	public Lion(String name, int age, Environment environment, Employee caretaker) {
		super(name, age, environment, caretaker);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	@Override
	public String feed() {
		// TODO Auto-generated method stub
		return "Employee feeds Lion with meat" ; 
	}

	@Override
	public String clean() {
		// TODO Auto-generated method stub
		return "Employee cleans ground and water for Lion" ; 
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "Visitors play by teasing the caged Lion" ; 
	}

	@Override
	public String feedSnack() {
		// TODO Auto-generated method stub
		return "Visitors feed lion by throwing meat" ; 
	}

	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "Lions roars" ; 
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return "Lion run around on the ground" ; 
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Lion eat meat and other animals" ; 
	}

	
	
}
