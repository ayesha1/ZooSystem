/**
 * Parent class of visitor, owner, and employee. 
 * @author Osama
 *
 */
public class Human {
	//name
	private String firstName, middleName, lastName;

	//Address stuff
	private String streetAddress, city, state, country;
	private int zipcode;

	//date of birth
	private String monthBorn;
	private int dayBorn, yearBorn;
	
	public Human(String name) {
		this.firstName = name;
	}
	
	public Human(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	public Human(String firstName, String middleName, String lastName, String streetAddress, String city, String state,
			String country, int zipcode, String monthBorn, int dayBorn, int yearBorn) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.monthBorn = monthBorn;
		this.dayBorn = dayBorn;
		this.yearBorn = yearBorn;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getMiddleName() {
		return middleName;
	}



	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getStreetAddress() {
		return streetAddress;
	}



	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public int getZipcode() {
		return zipcode;
	}



	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}



	public String getMonthBorn() {
		return monthBorn;
	}



	public void setMonthBorn(String monthBorn) {
		this.monthBorn = monthBorn;
	}



	public int getDayBorn() {
		return dayBorn;
	}



	public void setDayBorn(int dayBorn) {
		this.dayBorn = dayBorn;
	}



	public int getYearBorn() {
		return yearBorn;
	}



	public void setYearBorn(int yearBorn) {
		this.yearBorn = yearBorn;
	}

	
}
