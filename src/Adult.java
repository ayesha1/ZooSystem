
public class Adult extends Visitor {

	private int ticketAmt;

	public Adult(String firstName, String middleName, String lastName, int age, int ticketAmt) {
		
		super(firstName, middleName, lastName, age);
		this.ticketAmt = ticketAmt;
	}

	public Adult(String firstName, String middleName, String lastName, int age, String streetAddress, String city,
			String state, String country, int zipcode, String monthBorn, int dayBorn, int yearBorn) {
		
		super(firstName, middleName, lastName, age, streetAddress, city, state, country, zipcode, monthBorn, dayBorn, yearBorn);
		// TODO Auto-generated constructor stub
	}

	public Adult(String firstName, String middleName, String lastName, int age) {
		
		super(firstName, middleName, lastName, age);
		// TODO Auto-generated constructor stub
	}

	public int getTicketAmt() {
		return ticketAmt;
	}

	public void setTicketAmt(int ticketAmt) {
		this.ticketAmt = ticketAmt;
	}
	
	

}
