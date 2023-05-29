package address_Book;

import java.util.*;
import java.util.stream.Collectors;

public class MainNoDuplicateEntry {
	private static AddAddressBook addressBookMain;
	static ArrayList<Person> address = new ArrayList<>();

	static Scanner cs = new Scanner(System.in);
	static int option;
	private static int options;
	private static Collection<Person> contacts;

	public MainNoDuplicateEntry() {
		addressBookMain = new AddAddressBook();
	}

	/**
	 * This method is created to add multiple address book.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		start();
//		add();
	}

	/**
	 * To take user input
	 */
	public static void start() {
		System.out.print("Enter your choice: ");
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		while (!quit) {
			System.out.println("\n1. Add Address Book");
			System.out.println("2. Add Person");
			System.out.println("3. Update");
			System.out.println("4. Quit");

			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				addBookName();
				break;

			case 2:
				add();
				break;

			case 3:
				update();
				break;

			case 4:
				System.out.println("Exiting");
			}
		}
	}

	public static void addBookName() {
		System.out.print("Enter name of Address Book: ");
		String bookName = cs.nextLine();
		String addressBookName = bookName;
		addressBookMain.setAddressBookName(addressBookName);
		add();
	}

	/**
	 * To create a contact.
	 */
	public static void add() {
		System.out.print("Enter First Name:");
		String firstname = cs.next();
		List<Person> duplicateName = contacts.stream().filter(contact -> contact.getFirstName().equals(firstname))
				.collect(Collectors.toList());
		if (!(duplicateName.isEmpty())) {
			System.out.println("Contact already exists");
			add();
		}

		Person addressBook = new Person(null, null, null, null, null, option, null, null);
		System.out.println("Enter firstName:");
		addressBook.setFirstName(cs.next());

		System.out.println("Enter lastName:");
		addressBook.setLastName(cs.next());

		System.out.println("Enter address:");
		addressBook.setAddress(cs.next());

		System.out.println("Enter city:");
		addressBook.setCity(cs.next());

		System.out.println("Enter zip:");
		addressBook.setZip(cs.nextInt());

		System.out.println("Enter phoneNumber:");
		addressBook.setPhoneNumber(cs.next());

		System.out.println("Enter email:");
		addressBook.setEmail(cs.next());

		address.add(addressBook);
		System.out.println(address);
	}

	/**
	 * To Update a contact.
	 */
	public static void update() {

		for (Person addressBook : address) {
			System.err.println("enter firstName:");
			String firstName = addressBook.getFirstName();
			Object searchFirstName = cs.next();
			if (firstName.equals(searchFirstName)) {

				System.out.println("Choose field you want to add:");
				System.out.println("1.First Name\t2.Last Name\t3.Phone Number\t4.City\t5.Zip\t6. State");

				switch (cs.nextInt()) {
				case 1:
					System.out.println("Re-Correct your firstName");
					String upDate = cs.next();
					addressBook.setFirstName(upDate);
					System.out.println(address);
					break;
				case 2:
					System.out.println("Re-Correct your lastName");
					String upDate1 = cs.next();
					addressBook.setLastName(upDate1);
					System.out.println(address);
					break;
				case 3:
					System.out.println("Re-Correct your Phone Number");
					String upDate2 = cs.next();
					addressBook.setPhoneNumber(upDate2);
					System.out.println(address);
					break;
				case 4:
					System.out.println("Re-Correct your City");
					String upDate3 = cs.next();
					addressBook.setCity(upDate3);
					System.out.println(address);
					break;
				case 5:
					System.out.println("Re-Correct your Zip");
					int upDate4 = cs.nextInt();
					addressBook.setZip(upDate4);
					System.out.println(address);
					break;
				case 6:
					System.out.println("Re-Correct your Address");
					String upDate5 = cs.next();
					addressBook.setAddress(upDate5);
					System.out.println(address);
					break;
				}

			}

		}

	}

	/**
	 * To add multiple contacts.
	 */
	public static void addMultipleContact() {
		System.out.println("Enter how many contact you want to add:");
		int noOfPerson = cs.nextInt();
		for (int i = 1; i <= noOfPerson; i++) {
			add();
		}
	}
}
