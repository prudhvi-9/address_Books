package address_Book;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBook_ {

	Scanner cs = new Scanner(System.in);
	ArrayList<Contact_> contacts = new ArrayList<>();
	private String addressBookName;

	public String getAddressBookName() {
		return addressBookName;
	}

	public void setAddressBookName(String addressBookName) {
		this.addressBookName = addressBookName;
	}

	/**
	 * To create a contact.
	 */
	public void addContact() {
		System.out.println("Enter firstName:");
		String fName = cs.next();

		List<Contact_> duplicateName = contacts.stream().filter(contact -> contact.getFirstName().equals(fName))
				.collect(Collectors.toList());
		if (!(duplicateName.isEmpty())) {
			System.out.println("Contact already exists.");
			addContact();
			return;
		}
		Contact_ contact = new Contact_();
		contact.setFirstName(cs.next());

		System.out.println("Enter lastName:");
		contact.setLastName(cs.next());

		System.out.println("Enter address:");
		contact.setAddress(cs.next());

		System.out.println("Enter city:");
		contact.setCity(cs.next());

		System.out.println("Enter state:");
		contact.setState(cs.next());

		System.out.println("Enter zip:");
		contact.setZip(cs.next());

		System.out.println("Enter phoneNumber:");
		contact.setPhoneNumber(cs.next());

		System.out.println("Enter email:");
		contact.setEmail(cs.next());

		contacts.add(contact);
	}

	/**
	 * To Update a contact.
	 */
	public void editDetails() {
		System.out.println("Enter the First Name of the Contact you want to Edit:");
		String fname = cs.next();

		for (Contact_ addressBook : contacts) {
			if (fname.equals(addressBook.getFirstName())) {

				System.out.println("Choose field you want to add:");
				System.out.println("1.First Name\t2.Last Name\t3.Phone Number\t4.City\t5.Zip\t6. State");

				switch (cs.nextInt()) {
				case 1:
					System.out.println("Re-Correct your firstName");
					String upDate = cs.next();
					addressBook.setFirstName(upDate);
					break;
				case 2:
					System.out.println("Re-Correct your lastName");
					String upDate1 = cs.next();
					addressBook.setLastName(upDate1);
					break;
				case 3:
					System.out.println("Re-Correct your Phone Number");
					String upDate2 = cs.next();
					addressBook.setPhoneNumber(upDate2);
					break;
				case 4:
					System.out.println("Re-Correct your City");
					String upDate3 = cs.next();
					addressBook.setCity(upDate3);
					break;
				case 5:
					System.out.println("Re-Correct your Zip");
					String upDate4 = cs.next();
					addressBook.setZip(upDate4);
					break;
				case 6:
					System.out.println("Re-Correct your Address");
					String upDate5 = cs.next();
					addressBook.setAddress(upDate5);
					break;
				}
			} else {
				System.out.println("Contact not found");
			}
		}
	}

	/**
	 * To delete a contact.
	 */
	public void deleteDetails() {
		System.out.println("Enter the First Name of the Contact you want to Delete:");
		String name = cs.next();

		for (Contact_ tempContact : contacts) {
			if (tempContact.getFirstName().equals(name)) {
				contacts.remove(tempContact);
				System.out.println("Contact Deleted.");
			} else {
				System.out.println("Contact not found");
			}
		}
	}

	@Override
	public String toString() {
		return "AddressBook{" + "addressBookName='" + addressBookName + "contacts=" + contacts + " }";
	}

	public void setContact(ArrayList<Contact_> contact) {
		this.contacts = contact;
	}

	public Collection<Contact_> getContact() {
		return contacts;
		
	}
}
