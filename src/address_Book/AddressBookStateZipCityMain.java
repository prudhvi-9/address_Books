package address_Book;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBookStateZipCityMain {

	public static Map<String, AddressBookSorted> addressBookMap = new HashMap<>();
	static Scanner cs = new Scanner(System.in);

	/**
	 * This method is created to sort the entries.
	 * 
	 */
	public static void main(String[] args) {

		while (true) {
			System.out.println("Options are : ");
			System.out.println("1. Add Address Book");
			System.out.println("2. Add Person");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.println("5. Display Address Book");
			System.out.println("6. Search by city");
			System.out.println("7. sortbyName");
			System.out.println("8. sortbycity");
			System.out.println("9. Quit");

			int options = cs.nextInt();

			switch (options) {
			case 1:
				addAddressBook();
				break;
			case 2:
				addContacts();
				break;
			case 3:
				editContact();
				break;
			case 4:
				deleteContact();
				break;
			case 5:
				displayAddressBook();
				break;
			case 6:
				searchContactByCity();
				break;
			case 7:
				sortByName();
				break;
			case 8:
				sortByCity();
				break;
			case 9:
				System.out.println("Exiting");
				break;

			default:
				System.out.println("Invalid choice");
				break;

			}
		}
	}

	/*
	 * To add addressbook to map.
	 */
	public static void addAddressBook() {

		AddressBookSorted addressBook = new AddressBookSorted();
		System.out.println("Enter the name of the new Address Book: ");
		addressBook.setAddressBookName(cs.next());

		if (addressBookMap.containsKey(addressBook.getAddressBookName())) {
			System.out.println("Address Book already exists.");
			return;
		}
		addressBookMap.put(addressBook.getAddressBookName(), addressBook);
		System.out.println("Address Book Added.");

		boolean status = true;
		while (status) {
			System.out.println("1)To Add a Contact:");
			System.out.println("2)To exit :");
			int option = cs.nextInt();
			switch (option) {
			case 1:
				addressBook.addContact();
				System.out.println(addressBook);
				System.out.println("Contact Added.");
				break;
			case 2:
				System.out.println("Closing the addressBook.");
				status = false;
				break;
			default:
				System.out.println(" Invalid choice");
			}
		}
	}

	/*
	 * To add contact without duplicate contact.
	 */
	public static void addContacts() {
		System.out.println("Enter the name of the address book you want to add contact:");
		String bookname = cs.next();

		if (addressBookMap.containsKey(bookname)) {
			AddressBookSorted tempBook = addressBookMap.get(bookname);
			tempBook.addContact();
			System.out.println(tempBook);
			System.out.println("Contact Added.");
		} else
			System.out.println("Address Book not Found.");
	}

	/*
	 * To edit contact.
	 */
	public static void editContact() {
		System.out.println("Enter the name of the address book:");
		String bookname = cs.next();

		if (addressBookMap.containsKey(bookname)) {
			AddressBookSorted tempBook = addressBookMap.get(bookname);
			tempBook.editDetails();
		} else
			System.out.println(" Address Book not Found.");
	}

	/*
	 * To delete contact.
	 */
	public static void deleteContact() {
		System.out.println("Enter the name of the address book:");
		String bookname = cs.next();

		if (addressBookMap.containsKey(bookname)) {
			AddressBookSorted tempBook = addressBookMap.get(bookname);
			tempBook.deleteDetails();
		} else
			System.out.println(" Address Book not Found.");
	}

	/*
	 * To display addressBook.
	 */
	public static void displayAddressBook() {
		System.out.println("Enter the name of the address book:");
		String bookname = cs.next();

		if (addressBookMap.containsKey(bookname)) {
			AddressBookSorted address = addressBookMap.get(bookname);
			System.out.println(address);
		} else {
			System.out.println(" Address Book not Found.");
		}
	}

	/*
	 * Search Contact By City.
	 */
	public static void searchContactByCity() {
		List<Contact_> cityList = new ArrayList<>();

		System.out.println("Enter City name");
		String cityName = cs.next();

		addressBookMap.values().stream().forEach(addressBook -> cityList.addAll(addressBook.getContact().stream()
				.filter(contact -> contact.getCity().equalsIgnoreCase(cityName)).toList()));
		System.out.println(cityList);

	}

	/*
	 * method to view person by State.
	 */
	public static void viewContactByState() {
		List<Contact_> stateList = new ArrayList<>();

		System.out.println("Enter State name");
		String stateName = cs.next();

		addressBookMap.values().stream().forEach(addressBook -> stateList.addAll(addressBook.getContact().stream()
				.filter(contact -> contact.getCity().equalsIgnoreCase(stateName)).toList()));
		System.out.println(stateList);

	}

	/*
	 * To sort the entries alphabetically by Person's Name
	 */
	public static void sortByName() {
		List<Contact_> list = new ArrayList<>();

		addressBookMap.values().forEach(addressBook -> {
			list.addAll(addressBook.getContact().stream().sorted(Comparator.comparing(Contact_::getFirstName))
					.collect(Collectors.toList()));
		});

		System.out.println(list);
	}

	/*
	 * To sort entries by city.
	 */
	public static void sortByCity() {
		List<Contact_> list = new ArrayList<>();

		addressBookMap.values().forEach(addressBook -> {
			list.addAll(addressBook.getContact().stream().sorted(Comparator.comparing(Contact_::getCity))
					.collect(Collectors.toList()));
		});

		System.out.println(list);
	}

	/*
	 * To sort entries by State.
	 */
	public static void sortByState() {
		List<Contact_> list = new ArrayList<>();

		addressBookMap.values().forEach(addressBook -> {
			list.addAll(addressBook.getContact().stream().sorted(Comparator.comparing(Contact_::getState))
					.collect(Collectors.toList()));
		});

		System.out.println(list);
	}

	/*
	 * To sort entries by Zip.
	 */
	public static void sortByZip() {
		List<Contact_> list = new ArrayList<>();

		addressBookMap.values().forEach(addressBook -> {
			list.addAll(addressBook.getContact().stream().sorted(Comparator.comparing(Contact_::getZip))
					.collect(Collectors.toList()));
		});

		System.out.println(list);
	}
}
