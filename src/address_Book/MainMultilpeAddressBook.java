package address_Book;

import java.util.HashMap;
import java.util.Map;

public class MainMultilpeAddressBook {

	
	private Map<String, AddressBook> addressBooks;

	public MainMultilpeAddressBook() {
		addressBooks = new HashMap<>();
	}

	public void addAddressBook(String name) {
		addressBooks.put(name, new AddressBook(name));
	}

	public AddressBook getAddressBook(String name) {
		return addressBooks.get(name);
	}

	public void addPerson(Person person, String addressBookName) {
		AddressBook addressBook = addressBooks.get(addressBookName);
		if (addressBook != null) {
			addressBook.addPerson(person);
		} else {
			System.out.println("Address Book " + addressBookName + " does not exist.");
		}

	}

}
