
public class Visitor extends Human {

	private int age;
	public Visitor(String name, int age) {
		super(name);
		this.age = age;
	}

	public Visitor(String firstName, String middleName, String lastName, int age) {
		super(firstName, middleName, lastName);
		this.age = age;
	}

	public Visitor(String firstName, String middleName, String lastName, int age, String streetAddress, String city,
			String state, String country, int zipcode, String monthBorn, int dayBorn, int yearBorn) {
		
		super(firstName, middleName, lastName, streetAddress, city, state, country, zipcode, monthBorn, dayBorn, yearBorn);
		this.age = age;	
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
