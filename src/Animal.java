
public class Animal implements AnimalVisitorInteract, AnimalEmployeeInteract, AnimalActions {

	private String name;
	private int age;
	private Environment environment;
	private Caretaker caretaker;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String name, int age, Environment environment, Caretaker caretaker) {
		super();
		this.name = name;
		this.age = age;
		this.environment = environment;
		this.caretaker = caretaker;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Environment getEnvironment() {
		return environment;
	}

	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public Caretaker getCaretaker() {
		return caretaker;
	}

	public void setCaretaker(Caretaker caretaker) {
		this.caretaker = caretaker;
	}

	@Override
	public String feed() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String clean() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String feedSnack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return null;
	}

}
