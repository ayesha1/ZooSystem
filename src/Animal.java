
/**
 * This is parent class Animal
 * 
 * Camel, Dolphin, Elephant, Giraffe, Gorilla, Koala, Lion, Monkey, Panda, Penguin, Sloth, Snake, Tortoise, and Zebra extend this
 * 
 * It implements interface AnimalActions which has 7 static methods. This class only implements those with return null, subclasses 
 * will implement more intensly.
 * 
 * 
 * @author Osama
 *
 */
public class Animal implements AnimalActions {

	private String name;
	private int age;
	private Environment environment;
	private Employee caretaker;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String name, int age, Environment environment, Employee caretaker) {
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

	public Employee getCaretaker() {
		return caretaker;
	}

	public void setCaretaker(Employee caretaker) {
		this.caretaker = caretaker;
	}

	public static String feed() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	public static String clean() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String play() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String feedSnack() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String talk() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String move() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public static String eat() {
		// TODO Auto-generated method stub
		return null;
	}

}
