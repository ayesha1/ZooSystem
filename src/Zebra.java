
public class Zebra extends Animal {

	public Zebra() {
		// TODO Auto-generated constructor stub
	}

	public Zebra(String name, int age, Environment environment, Employee caretaker) {
		super(name, age, environment, caretaker);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String feed() {
		// TODO Auto-generated method stub
		return "Employee feeds Zebra with twigs, grass, and herbs " ; 
	}

	@Override
	public String clean() {
		// TODO Auto-generated method stub
		return "Employee cleans ground and water body for Zebra" ; 
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "Visitors play by looking at running Zebra in the cage or in the fence" ; 
	}

	@Override
	public String feedSnack() {
		// TODO Auto-generated method stub
		return "Visitors feeds Zebra with herbs and grass" ; 
	}

	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "Zebra makes sounds like GRHHHHHHHHHHHHHHHHHHHHHH" ; 
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return "Zebra run on the ground" ; 
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Zebra eats grass and herbs from the ground " ; 
	}

}
