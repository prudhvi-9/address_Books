package address_Book;

import java.util.ArrayList;
import java.util.*;

public class MainMultipleContact {

	static ArrayList<EditContact> address = new ArrayList<>();
	static Scanner cs = new Scanner(System.in);
	static int option;
	private static int options;

	/**
	 * This method is created to add multiple contacts to the addressbook.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		addMultipleContact();
	}

	public static void mainmenu() {
		System.out.println("Enter the option:\n1)Add contact.\t2)Update.\t3)Exit.");
		options = cs.nextInt();
	}

	/**
	 * To create a contact.
	 */
	public static void add() {

		EditContact addressBook = new EditContact(null, null, null, null, option, null, null);
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

		for (EditContact addressBook : address) {
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
		System.out.println("Enter how many contact you waant to add:");
		int noOfPerson = cs.nextInt();
		for (int i = 1; i <= noOfPerson; i++) {
			add();
		}
	}
}
