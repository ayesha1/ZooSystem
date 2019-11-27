
public class Monkey extends Animal {

	public Monkey() {
		// TODO Auto-generated constructor stub
	}

	public Monkey(String name, int age, Environment environment, Employee caretaker) {
		super(name, age, environment, caretaker);
		// TODO Auto-generated constructor stub
	}

	
	
	
	@Override
	public String feed() {
		// TODO Auto-generated method stub
		return "Employeee feeds Monkey with banana" ; 
	}

	@Override
	public String clean() {
		// TODO Auto-generated method stub
		return "Employee cleans the cage for Monkey" ; 
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "Visitors play by teasing the caged Monkey" ; 
	}

	@Override
	public String feedSnack() {
		// TODO Auto-generated method stub
		return "Visitors feed bananas to Monkey" ; 
	}

	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "Monkey chatter sounds" ; 
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return "Monkey climbs and jumbs on the tress" ; 
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Moneky eats bananas" ; 
	}

}
