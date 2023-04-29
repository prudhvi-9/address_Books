package address_Book;

import java.util.ArrayList;
import java.util.*;

public class MainDeleteContact {
	static ArrayList<DeleteContact> address = new ArrayList<>();
	static Scanner cs = new Scanner(System.in);
	static int option;
	private static int options;

	/**
	 * This method is created to delete a contact to the addressbook.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		mainmenu();

		switch (options) {
		case 1:
			add();

			menu();

			switch (option) {
			case 1:
				add();
				menu();
			case 2:
				update();
			case 3:
				delete();

			}
			break;

		case 2:
			System.out.println("exiting");
		}
	}

	public static void mainmenu() {
		System.out.println("Enter the option:\n1)Add contact.\t2)Exit");
		options = cs.nextInt();
	}

	public static void menu() {
		System.out.println("1)Add contact\t.2)Edit contact.\t3)Delete contact");
		option = cs.nextInt();
	}

	/**
	 * To create a contact.
	 */
	public static void add() {

		DeleteContact addressBook = new DeleteContact(null, null, null, null, option, null, null);
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

		for (DeleteContact addressBook : address) {
			System.err.println("enter firstName:");
			String firstName = addressBook.getFirstName();
			Object searchFirstName = cs.next();
			if (firstName.equals(searchFirstName)) {

				System.out.println("Choose field you want to update:");
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

			} else {
				System.out.println("Record  not foud");
			}
		}

	}

	/**
	 * To delete a contact.
	 */

	public static void delete() {

		for (DeleteContact addressBook : address) {

			System.out.println("Enter your First name:");
			String firstname = addressBook.getFirstName();
			Object clearing = cs.next();

			if (clearing.equals(firstname)) {
				System.out.println("Contact Deleted");
				address.remove(address);
				System.out.println(address);

			}

			else {
				System.out.println("Record not found");
			}
		}
	}

}
