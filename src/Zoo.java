import java.util.ArrayList;

public class Zoo {
	
	private Owner owner;
	private ArrayList<Employee> employees;
	private ArrayList<Visitor> visitors;
	
	public Zoo() {
		// TODO Auto-generated constructor stub
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
