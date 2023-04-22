package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contact.Contact;
import contact.ContactService;

class ContactServiceTest {

	@Test
	public void testAdd() {
		ContactService contactservice = new ContactService();
		Contact test1 = new Contact("test1", "Ashley", "Lien", "123456789", "123 Fake St.");
		assertEquals(true. contactservice.addContact(test1));
	}
	@Test
	public void testDelete() {
		ContactService contactservice = new ContactService();
		Contact test1 = new Contact("test1", "Ashley", "Lien", "123456789", "123 Fake St.");
		Contact test2 = new Contact("test2", "Yelhsa", "Neil", "987654321", ".tS ekaF 321");
		contactservice.addContact(test1);
		contactservice.addContact(test2);
		assertEquals(false, contactservice.deleteContact("test001"));
		assertEquals(false, contactservice.deleteContact("test002"));
	}
	@Test
	public void testUpdate() {
		ContactService contactservice = new ContactService();
		Contact test1 = new Contact("test1", "Ashley", "Lien", "123456789", "123 Fake St.");
		Contact test2 = new Contact("test2", "Yelhsa", "Neil", "987654321", ".tS ekaF 321");
		contactservice.addContact(test1);
		contactservice.addContact(test2);
		assertEquals(true, contactservice.updateContact("test1", "Ashley", "Lien", "123456789", "123 Fake St."));
		assertEquals(true, contactservice.updateContact("test2", "Yelhsa", "Neil", "987654321", ".tS ekaF 321"));
	}

}
