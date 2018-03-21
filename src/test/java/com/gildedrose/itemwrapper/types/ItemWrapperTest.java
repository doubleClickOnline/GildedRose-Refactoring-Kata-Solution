package com.gildedrose.itemwrapper.types;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.gildedrose.itemwrapper.types.ItemWrapper;

public class ItemWrapperTest {
	
	@Test
	public void equalsItemsTest() {

		ItemWrapper item = new ItemWrapper("testItem", 0, 2);
		ItemWrapper equalItem = new ItemWrapper("testItem", 0, 2);
		assertEquals(equalItem, item);
	}
	
	@Test
	public void notEqualsItemsTest() {

		ItemWrapper item = new ItemWrapper("testItem", 0, 2);
		ItemWrapper notEqualItem = new ItemWrapper("testItem", 0, 3);
		assertNotEquals(notEqualItem, item);
	}

}
