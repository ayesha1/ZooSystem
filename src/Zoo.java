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
//		Caretaker a = new Caretaker();
		return null;
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
