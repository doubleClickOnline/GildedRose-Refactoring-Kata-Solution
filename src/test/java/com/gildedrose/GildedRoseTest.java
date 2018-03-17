package com.gildedrose;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GildedRoseTest {

	private List<Item> items;

	@Before
	public void setupDummyData() {

		items = Arrays.<Item>asList(new Item[] { new Item("+5 Dexterity Vest", 10, 20), //
				new Item("Aged Brie", 2, 0), //
				new Item("Elixir of the Mongoose", 5, 7), //
				new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
				new Item("Sulfuras, Hand of Ragnaros", -1, 80),
				new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
				new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
				new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
				// this conjured item does not work properly yet
				new Item("Conjured Mana Cake", 3, 6) });
	}

	@Test
	public void updateFooTest() {
		
		List<Item> items = Arrays.<Item>asList(new Item[] { new Item("foo", 0, 0)});
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertEquals("foo", app.getItems().get(0).getName());
	
	}

	@Test
	public void updateAfterOneDayTest() {

		GildedRose app = new GildedRose(items);

		int days = 1;
		for (int i = 0; i < days; i++) {
			app.updateQuality();
		}
		
		List<Item> results = items;
		assertTrue(results.contains(new Item("+5 Dexterity Vest", 9, 19)));
		assertTrue(results.contains(new Item("Aged Brie", 1, 1)));
		assertTrue(results.contains(new Item("Elixir of the Mongoose", 4, 6)));
		assertTrue(results.contains(new Item("Sulfuras, Hand of Ragnaros", 0, 80)));
		assertTrue(results.contains(new Item("Sulfuras, Hand of Ragnaros", -1, 80)));
		assertTrue(results.contains(new Item("Backstage passes to a TAFKAL80ETC concert", 14, 21)));
		assertTrue(results.contains(new Item("Backstage passes to a TAFKAL80ETC concert", 9, 50)));
		assertTrue(results.contains(new Item("Backstage passes to a TAFKAL80ETC concert", 4, 50)));
		assertTrue(results.contains(new Item("Conjured Mana Cake", 2, 5)));
	}

	@Test
	public void updateAfterTwoDaysTest() {

		GildedRose app = new GildedRose(items);

		int days = 2;
		for (int i = 0; i < days; i++) {
			app.updateQuality();
		}
		
		List<Item> results = items;
		assertTrue(results.contains(new Item("+5 Dexterity Vest", 8, 18)));
		assertTrue(results.contains(new Item("Aged Brie", 0, 2)));
		assertTrue(results.contains(new Item("Elixir of the Mongoose", 3, 5)));
		assertTrue(results.contains(new Item("Sulfuras, Hand of Ragnaros", 0, 80)));
		assertTrue(results.contains(new Item("Sulfuras, Hand of Ragnaros", -1, 80)));
		assertTrue(results.contains(new Item("Backstage passes to a TAFKAL80ETC concert", 13, 22)));
		assertTrue(results.contains(new Item("Backstage passes to a TAFKAL80ETC concert", 8, 50)));
		assertTrue(results.contains(new Item("Backstage passes to a TAFKAL80ETC concert", 3, 50)));
		assertTrue(results.contains(new Item("Conjured Mana Cake", 1, 4)));
	}

}
