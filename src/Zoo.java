import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Zoo {
	public static LinkedList<Visitor> listOfVisitors = new LinkedList<Visitor>();
	ListIterator<Visitor> iterator = listOfVisitors.listIterator();
	
	private Owner owner;
	private ArrayList<Employee> employees;
	private ArrayList<Visitor> visitors;
	public static int pay;
	
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
