package contact;

public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;
	
	public Contact(String contactID, String firstName, String lastName, String phoneNum, String address) {
		if(contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if (firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		if (lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		if (phoneNum == null || phoneNum.length()!= 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		if (address == null || address.length()<30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	public String getContactID() {
		return contactID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public String getAddress() {
		return address;
	}
}

	

