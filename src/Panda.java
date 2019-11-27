
public class Panda extends Animal {

	public Panda() {
		// TODO Auto-generated constructor stub
	}

	public Panda(String name, int age, Environment environment, Employee caretaker) {
		super(name, age, environment, caretaker);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String feed() {
		// TODO Auto-generated method stub
		return "Employee feeds Panada with fishes" ; 
	}

	@Override
	public String clean() {
		// TODO Auto-generated method stub
		return "Employee cleans water and ground for Panada" ; 
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "Visitor plays with banda by feeding him some fishes" ; 
	}

	@Override
	public String feedSnack() {
		// TODO Auto-generated method stub
		return "Visitor feeds Panada some fishes" ; 
	}

	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "Panda growls" ; 
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return "Panda runs on the ground" ; 
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Panda eats bushes and fishes" ; 
	}

}
