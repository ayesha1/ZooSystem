
public class Employee extends Human {

	
	//Tax and work info
	private long socialSecurity;
	private String workType; //Full time or contractor or part time etc used for tax purposes
	private double salary; //yearly
	
	//Login information
	private String email;
	private String password;
	
	public Employee(String firstName, String middleName, String lastName, long socialSecurity, String workType,
			double salary, String email, String password) {
		super(firstName, middleName, lastName);
		this.socialSecurity = socialSecurity;
		this.workType = workType;
		this.salary = salary;
		this.email = email;
		this.password = password;
	}

	public Employee(String firstName, String middleName, String lastName, String streetAddress, String city,
			String state, String country, int zipcode, String monthBorn, int dayBorn, int yearBorn) {
		
		super(firstName, middleName, lastName, streetAddress, city, state, country, zipcode, monthBorn, dayBorn, yearBorn);
		
		this.socialSecurity = socialSecurity;
		this.workType = workType;
		this.salary = salary;
		this.email = email;
		this.password = password;	
		
	}

	public long getSocialSecurity() {
		return socialSecurity;
	}

	public void setSocialSecurity(long socialSecurity) {
		this.socialSecurity = socialSecurity;
	}

	public String getWorkType() {
		return workType;
	}

	public void setWorkType(String workType) {
		this.workType = workType;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
