package address_Book;

import java.util.ArrayList;
import java.util.*;

public class MainCreateAddressBook {
	static ArrayList<CreateAddressBook> address = new ArrayList<>();
	static Scanner cs = new Scanner(System.in);
	static int option;
	private static int options;

	/**
	 * This method is created to add a contact to the addressbook.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		mainmenu();

		switch (options) {
		case 1:
			add();
			mainmenu();
			switch (options) {
			case 1:
				add();
				mainmenu();
			}
		case 2:
			System.out.println("exiting");
		}
	}

	/**
	 * Mainmenu.
	 */
	public static void mainmenu() {
		System.out.println("Enter the option:\n1)Add contact.\t2)Exit.");
		options = cs.nextInt();
	}

	/**
	 * To create a contact.
	 */
	public static void add() {

		CreateAddressBook addressBook = new CreateAddressBook(null, null, null, null, option, null, null);
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

}
