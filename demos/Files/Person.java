public class Person {
	private String firstName;
	private String lastName;
	private Integer yearOfBirth;

	public Person() {
		setFirstName("");
		setLastName("");
		setYearOfBirth(0);
	}

	public Person(String firstName, String lastName, Integer yearOfBirth) {
		setFirstName(firstName);
		setLastName(lastName);
		setYearOfBirth(yearOfBirth);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(Integer yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " " + yearOfBirth;
	}
}
