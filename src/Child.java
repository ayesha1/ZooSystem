
public class Child extends Visitor {

	private int ticketAmt;
	
	public Child(String firstName, String middleName, String lastName, int ticketAmt, int age) {
		super(firstName, middleName, lastName, age);

		this.ticketAmt = ticketAmt;
	}

	public Child(String firstName, String middleName, String lastName, int ticketAmt, int age, String streetAddress, String city,
			String state, String country, int zipcode, String monthBorn, int dayBorn, int yearBorn) {
		
		super(firstName, middleName, lastName, age, streetAddress, city, state, country, zipcode, monthBorn, dayBorn,
				yearBorn);
		
		this.ticketAmt = ticketAmt;
	}

	public int getTicketAmt() {
		return ticketAmt;
	}

	public void setTicketAmt(int ticketAmt) {
		this.ticketAmt = ticketAmt;
	}
	

}
