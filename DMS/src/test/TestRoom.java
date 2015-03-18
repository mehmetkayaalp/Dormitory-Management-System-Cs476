package test;

import static org.junit.Assert.*;

import org.junit.Test;

import background.Room;

public class TestRoom {

	@Test
	public void testTypeName() {
		Room room = new Room();
		room.setTypeName("vol");
		assertEquals("vol", room.getTypeName());
	}
	
	@Test
	public void testRoomNo() {
		Room room = new Room();
		room.setRoomNo(0);
		assertEquals(0, room.getRoomNo());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testRoomPrice() {
		Room room = new Room();
		room.setRoomPrice((double) 600.0);
		assertEquals(600.0, room.getRoomPrice());
	}

}
