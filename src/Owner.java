
public class Owner extends Human {

	private double money;
	
	public Owner(String firstName, String middleName, String lastName, double money) {
		super(firstName, middleName, lastName);
		this.money = money;
		// TODO Auto-generated constructor stub
	}

	public Owner(String firstName, String middleName, String lastName, String streetAddress, String city, String state,
			String country, int zipcode, String monthBorn, int dayBorn, int yearBorn) {
		
		super(firstName, middleName, lastName, streetAddress, city, state, country, zipcode, monthBorn, dayBorn,
				yearBorn);
		// TODO Auto-generated constructor stub
	}

}
