import java.util.ArrayList;

public class Zoo {
	
	private Owner owner;
	private ArrayList<Employee> employees;
	private ArrayList<Visitor> visitors;
	
	public Zoo() {
		// TODO Auto-generated constructor stub
		this.owner = new Owner("Jimbob", "Jerry", "Jones");
		this.employees = generateEmployees();
		
		//empty list. added upon when visitors fill out form
		visitors = new ArrayList<>();
	}
	
	/**
	 * Hard code a bunch of employees and return a list of them
	 * @return
	 */
	private ArrayList<Employee> generateEmployees() { 
		Employee acquaticCaretaker = new Employee();
		return null;
	}
	private ArrayList<Environment> generateEnvironments() {
		//generates environments with animals
		
		
		
		Environment aquatic = new Aquatic();
	}
	private ArrayList<Animal> generateAquaticAnimals(Environment acquatic, Employee acquaticCaretaker) {
		Dolphin dolphin1 = new Dolphin("Jerry", 7, acquatic, acquaticCaretaker);
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
