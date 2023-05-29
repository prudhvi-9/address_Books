package address_Book;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {

	private String name;
	private List<Person> contacts;

	public AddressBook(String name) {
		this.name = name;
		contacts = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public List<Person> getContacts() {
		return contacts;
	}

	public void addPerson(Person person) {
		contacts.add(person);
	}

	
	
}
