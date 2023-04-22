package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contact.Contact;


class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact ("12345", "Lien", "Ashley", "123456789", "123 Fake St.")
;
		assertTrue(contact.getContactID().equals("12345"));
		assertTrue(contact.getFirstName().equals("Ashley"));
		assertTrue(contact.getLastName().equals("Lien"));
		assertTrue(contact.getPhoneNum().equals("123456789"));
		assertTrue(contact.getAddress().equals("123 Fake St."));
		}

	private void assertTrue(boolean equals) {
		// TODO Auto-generated method stub
		
	}
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArguementException.class, () -> {
			new Contact("12345111111", "Lien", "Ashley", "123456789", "123 Fake St.");
		}); }
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "AshleyMichelleLien", "Lien", "123456789", "123 Fake St.");
		}); }
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Ashley", "AshleyMichelleLien", "123456789", "123 Fake St.");
			
		}); }
	@Test
	void testContactPhoneNumTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Ashley", "Lien", "12345678900000", "123 Fake St.");
		}); }
	void testContactPhoneNumTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Ashley", "Lien", "123", "123 Fake St.");
		}); }
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Ashley", "Lien", "123456789", "11111111111111122222222222222222222222222222233333333333 Fake St.");
		}); }
	@Test
	void testContactIDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Ashley", "Lien", "123456789", "123 Fake St.");
		}); }
	@Test
	void testContactFirstNameIsNull() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", null, "Lien", "123456789", "123 Fake St.");
		}); }
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Ashley", null, "123456789", "123 Fake St.");
		}); }
	@Test
	void testContactPhoneNumIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Ashley", "Lien", null, "123 Fake St.");
		}); }
	@Test
	void testContactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Ashley", "Lien", "123456789", null);
		}); }
	}
		
}
