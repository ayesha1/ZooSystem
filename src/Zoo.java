import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Generates all the environments, all the employees, and all the animals.
 * @author Osama
 *
 */
public class Zoo {
	public static LinkedList<Visitor> listOfVisitors = new LinkedList<Visitor>();
	ListIterator<Visitor> iterator = listOfVisitors.listIterator();
	
	private Owner owner;
	private ArrayList<Employee> employees;
	private ArrayList<Visitor> visitors;
	public static int pay;
	
	public Zoo() {
		// TODO Auto-generated constructor stub
		
		//this is our owner
		this.owner = new Owner("Jimbob", "Jerry", "Jones", 0);
		
		generateZoo();
		
		//empty list. added upon when visitors fill out form
		visitors = new ArrayList<>();
	}
	
	/**
	 * Hard code a bunch of employees and return a list of them
	 * 
	 * String firstName, String middleName, String lastName, long socialSecurity, String workType,
			double salary, String email, String password
	 * @return
	 */
	private void generateZoo() { 
		Employee aquaticCaretaker = new Employee("James", "John", "Gilligan", 1234567, "Fulltime", 45000, "johngil@zoo.com", "123abc");
		Employee arcticCaretaker = new Employee("Man", "Man", "Three", 1234567, "Fulltime", 45000, "manthree@zoo.com", "123abc");
		Employee desertCaretaker = new Employee("Monica", "Stone", "Georgia", 1234567, "Fulltime", 55000, "monicageorge@zoo.com", "123abc");
		Employee forestCaretaker = new Employee("Albert", "John", "Jones", 1234567, "Fulltime", 45000, "albjones@zoo.com", "123abc");
		Employee savannaCaretaker = new Employee("Carlos", "", "Gilligan", 1234567, "Parttime", 25000, "carlos@zoo.com", "123abc");
		Employee tropicalCaretaker = new Employee("Katie", "Carly", "Corbelt", 1234567, "Fulltime", 65000, "KatieCorblet@zoo.com", "123abc");

		this.employees.add(tropicalCaretaker);
		this.employees.add(aquaticCaretaker);
		this.employees.add(savannaCaretaker);
		this.employees.add(forestCaretaker);
		this.employees.add(arcticCaretaker);
		this.employees.add(desertCaretaker);
		
		Environment aquaticEnv = new Aquatic(68, "blue", new ArrayList<Animal>());
		aquaticEnv.addAnimal(new Dolphin("Jerry", 7, aquaticEnv, aquaticCaretaker));
		aquaticEnv.addAnimal(new Dolphin("Dolphina", 5, aquaticEnv, aquaticCaretaker));

		Environment arcticEnv = new Arctic(15, "white", new ArrayList<Animal>());
		arcticEnv.addAnimal(new Penguin("Jonjon", 4, arcticEnv, arcticCaretaker));
		arcticEnv.addAnimal(new Penguin("Gary", 4, arcticEnv, arcticCaretaker));
		
		Environment desertEnv = new Desert(85, "yellow", new ArrayList<Animal>());
		desertEnv.addAnimal(new Camel("Camron", 87, desertEnv, desertCaretaker));
		desertEnv.addAnimal(new Snake("Sally", 6, desertEnv, desertCaretaker));

		Environment forestEnv = new Forest(75, "green", new ArrayList<Animal>());
		forestEnv.addAnimal(new Panda("Perry", 15, forestEnv, forestCaretaker));
		forestEnv.addAnimal(new Sloth("Salty", 25, forestEnv, forestCaretaker));
		forestEnv.addAnimal(new Gorilla("Gary", 5, forestEnv, forestCaretaker));
		forestEnv.addAnimal(new Tortoise("Terry", 105, forestEnv, forestCaretaker));
		
		Environment savannaEnv = new Savanna(80, "yellow", new ArrayList<Animal>());
		savannaEnv.addAnimal(new Giraffe("Gaff", 5, savannaEnv, savannaCaretaker));
		savannaEnv.addAnimal(new Lion("Leon", 5, savannaEnv, savannaCaretaker));
		savannaEnv.addAnimal(new Zebra("Debra", 5, savannaEnv, savannaCaretaker));

		Environment tropicalEnv = new Tropical(68, "Dark Green", new ArrayList<Animal>());
		tropicalEnv.addAnimal(new Elephant("Ella", 15, tropicalEnv, tropicalCaretaker));
		tropicalEnv.addAnimal(new Koala("Kella", 15, tropicalEnv, tropicalCaretaker));
		tropicalEnv.addAnimal(new Monkey("Kea", 15, tropicalEnv, tropicalCaretaker));


	}
	

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	public ArrayList<Visitor> getVisitors() {
		return visitors;
	}

	public void setVisitors(ArrayList<Visitor> visitors) {
		this.visitors = visitors;
	}

	
}
