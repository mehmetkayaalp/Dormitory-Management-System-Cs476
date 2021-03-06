package test;

import static org.junit.Assert.*;

import org.junit.Test;

import background.EmergencyContact;

public class TestEmergencyContact {

	@Test
	public void testName() {
		EmergencyContact emergencyContact = new EmergencyContact();
		emergencyContact.setName("Gamze");
		assertEquals("Gamze", emergencyContact.getName());
	}
	
	@Test
	public void testName2() {
		EmergencyContact emergencyContact = new EmergencyContact();
		emergencyContact.setName("");
		assertEquals("", emergencyContact.getName());
	}
	
	@Test
	public void testSurname() {
		EmergencyContact emergencyContact = new EmergencyContact();
		emergencyContact.setSurname("Ko�");
		assertEquals("Ko�", emergencyContact.getSurname());
	}
	
	@Test
	public void testSurname2() {
		EmergencyContact emergencyContact = new EmergencyContact();
		emergencyContact.setSurname("");
		assertEquals("", emergencyContact.getSurname());
	}
	
	@Test
	public void testPhone() {
		EmergencyContact emergencyContact = new EmergencyContact();
		emergencyContact.setPhone("111-111-1111");
		assertEquals("111-111-1111", emergencyContact.getPhone());
	}
	
	@Test
	public void testPhone2() {
		EmergencyContact emergencyContact = new EmergencyContact();
		emergencyContact.setPhone("");
		assertEquals("", emergencyContact.getPhone());
	}

}
