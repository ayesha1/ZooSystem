
public class Snake extends Animal {

	public Snake() {
		// TODO Auto-generated constructor stub
	}

	public Snake(String name, int age, Environment environment, Employee caretaker) {
		super(name, age, environment, caretaker);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String feed() {
		// TODO Auto-generated method stub
		return "Employee feeds snakes with rodents and birds" ; 
	}

	@Override
	public String clean() {
		// TODO Auto-generated method stub
		return "Employee cleans water bed and ground holes for snakes" ; 
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "Visitors hang snakes on their arms our around their body" ; 
	}

	@Override
	public String feedSnack() {
		// TODO Auto-generated method stub
		return "Visitors feed snakes with some dead rodents and birds" ; 
	}

	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "Snakes says szzzzzzzzzzzzzzzzzz" ; 
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return "Snakes crawls " ; 
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Snakes eats rodents and birds" ; 
	}

}
