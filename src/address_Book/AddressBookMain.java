package address_Book;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {

	public static Map<String, AddressBooks> addressBookMap = new HashMap<>();
	static Scanner cs = new Scanner(System.in);

	/**
	 * This method is created to add a contact to the addressbook without duplicate
	 * contacts.
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
			System.out.println("6. Quit");

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

		AddressBooks addressBook = new AddressBooks();
		System.out.println("Enter the name of the new Address Book: ");
		addressBook.setAddressBookName(cs.next());

		if (addressBookMap.containsKey(addressBook.getAddressBookName())) {
			System.out.println("Address Book already exists.");
			return;
		}
		addressBookMap.put(addressBook.getAddressBookName(), addressBook);
		System.out.println("Address Book Added.");

		while (true) {
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
			AddressBooks tempBook = addressBookMap.get(bookname);
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
			AddressBooks tempBook = addressBookMap.get(bookname);
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
			AddressBooks tempBook = addressBookMap.get(bookname);
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
			AddressBooks address = addressBookMap.get(bookname);
			System.out.println(address);
		} else
			System.out.println(" Address Book not Found.");
	}

}
