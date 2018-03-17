package com.gildedrose;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class ItemTest {
	
	@Test
	public void equalsItemsTest() {

		Item item = new Item("testItem", 0, 2);
		Item equalItem = new Item("testItem", 0, 2);
		assertEquals(equalItem, item);
	}
	
	@Test
	public void notEqualsItemsTest() {

		Item item = new Item("testItem", 0, 2);
		Item notEqualItem = new Item("testItem", 0, 3);
		assertNotEquals(notEqualItem, item);
	}

}
