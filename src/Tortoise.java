
public class Tortoise extends Animal {

	public Tortoise() {
		// TODO Auto-generated constructor stub
	}

	public Tortoise(String name, int age, Environment environment, Employee caretaker) {
		super(name, age, environment, caretaker);
		// TODO Auto-generated constructor stub
	}

	
	
	
	@Override
	public String feed() {
		// TODO Auto-generated method stub
		return "Employee feeds Tortoise with dead fishes, apples, and kale" ; 
	}

	@Override
	public String clean() {
		// TODO Auto-generated method stub
		return "Employee cleans ground and water body for Tortoise" ; 
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "Visitors sit and take pictures with Tortoise" ; 
	}

	@Override
	public String feedSnack() {
		// TODO Auto-generated method stub
		return "Visitors feed kale, apples, and alfalfa to Tortoise" ; 
	}

	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "Tortoise makes noises like series of clucks" ; 
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return "Tortoise crawls on ground and swims in the water" ; 
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Tortoise eats apples, kale, and alfaalfa" ; 
	}

}
