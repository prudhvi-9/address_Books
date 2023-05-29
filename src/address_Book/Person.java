package address_Book;

public class Person {

	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private int zip;
	private String phoneNumber;
	private String email;
	private AddAddressBook addressbook;

	/**
	 * Constructor
	 * 
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param city
	 * @param zip
	 * @param phoneNumber
	 * @param email
	 */

	public Person(AddAddressBook addressbook, String firstName, String lastName, String address, String city, int zip,
			String phoneNumber, String email) {
		super();
		this.addressbook = addressbook;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	/**
	 * Getter and Setter Methods.
	 * 
	 * @return
	 */
	public AddAddressBook getAddressbook() {
		return addressbook;
	}

	public void setAddressbook(AddAddressBook addressbook) {
		this.addressbook = addressbook;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Print the data.
	 */
	@Override
	public String toString() {
		return "MultipleAddressBook [addressbook=" + addressbook + ",firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", city=" + city + ", zip=" + zip + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + "]";
	}

}
