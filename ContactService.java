package contact;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ContactService {
	private String contactID;
	
	private List<Contact> contactList = new ArrayList<>();{
		contactID = UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10));
	}
	public void newContact() {
		Contact contact = new Contact(newContactID());
		contactList.add(contact);
	}
	public void newContact(String firstName) {
		Contact contact = new Contact(newContactID(), firstName);
		contactList.add(contact);
	}
	public void newContact(String firstName, String lastName) {
		Contact contact = new Contact(newContactID(), firstName, lastName);
		contactList.add(contact);
	}
	public void newContact(String firstName, String lastName, String phoneNum) {
		Contact contact = new Contact(newContactID(), firstName, lastName, phoneNum);
		contactList.add(contact);
		
	}
	public void newContact(String firstName, String lastName, String phoneNum, String address) {
		Contact contact = new Contact(newContactID(), firstName, lastName, phoneNum, address);
		contactList.add(contact);
	}
	public void deleteContact(String id) throws Exception {
		contactList.remove(searchForContact(id));
	}
	public void updateFirstName(String id, String firstName) throws Exception {
		searchForContact(id).setFirstName(firstName);
	}
	public void updateLastName(String id, String lastName) throws Exception {
		searchForContact(id).setLastName(lastName);
	}
	public void updatePhoneNum(String id, String phoneNum) throws Exception {
		searchForContact(id).setPhoneNum(phoneNum);
	}
	public void updateAddress(String id, String address) throws Exception {
		searchForContact(id).setAddress(address);
	}
	protected List<Contact> getContactList()
	{
		return contactList;
	}
	private String newContactID() {
		return contactID = UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10));
	}
	private Contact searchForContact(String id) throws Exception {
		int index = 0;
		while (index < contactList.size()) {
			if (id.equals(contactList.get(index).getContactID())) {
				return contactList.get(index);
			}
			index++;
		}
		throw new Exception ("The Task does not exist.");
	}
}
