package com.gildedrose;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.gildedrose.itemwrapper.types.ItemWrapper;
import com.gildedrose.itemwrapper.types.ItemWrapperFactory;

public class GildedRoseTest {

	private List<ItemWrapper> items;

	@Before
	public void setupDummyData() {

		ItemWrapperFactory factory = new ItemWrapperFactory();

		items = Arrays.<ItemWrapper>asList(new ItemWrapper[] { factory.create("+5 Dexterity Vest", 10, 20), //
			factory.create("Aged Brie", 2, 0), //
			factory.create("Aged Brie", -5, 10), //
			factory.create("Aged Brie", -5, 100), //
			factory.create("Elixir of the Mongoose", 5, 7), //
			factory.create("Elixir of the Mongoose", -5, 10), 
			factory.create("Sulfuras, Hand of Ragnaros", 0, 80), //
			factory.create("Sulfuras, Hand of Ragnaros", -1, 80),
			factory.create("Backstage passes to a TAFKAL80ETC concert", 15, 20),
			factory.create("Backstage passes to a TAFKAL80ETC concert", 10, 49),
			factory.create("Backstage passes to a TAFKAL80ETC concert", 5, 49),
			factory.create("Backstage passes to a TAFKAL80ETC concert", 5, 45),
			factory.create("Backstage passes to a TAFKAL80ETC concert", -15, 30),
			factory.create("Conjured Mana Cake", 3, 6) });
	}

	@Test
	public void updateFooTest() {

		List<ItemWrapper> items = Arrays.<ItemWrapper>asList(new ItemWrapper[] { new ItemWrapper("foo", 0, 0) });
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertEquals("foo", app.getItems().get(0).getName());

	}

	@Test
	public void updateAfterOneDayTest() {

		GildedRose app = new GildedRose(items);
		app.updateQuality();

		List<ItemWrapper> results = items;
		assertTrue(results.contains(new ItemWrapper("+5 Dexterity Vest", 9, 19)));
		assertTrue(results.contains(new ItemWrapper("Aged Brie", 1, 1)));
		assertTrue(results.contains(new ItemWrapper("Aged Brie", -6, 12)));
		assertTrue(results.contains(new ItemWrapper("Aged Brie", -6, 100)));
		assertTrue(results.contains(new ItemWrapper("Elixir of the Mongoose", 4, 6)));
		assertTrue(results.contains(new ItemWrapper("Elixir of the Mongoose", -6, 8)));
		assertTrue(results.contains(new ItemWrapper("Sulfuras, Hand of Ragnaros", 0, 80)));
		assertTrue(results.contains(new ItemWrapper("Sulfuras, Hand of Ragnaros", -1, 80)));
		assertTrue(results.contains(new ItemWrapper("Backstage passes to a TAFKAL80ETC concert", 14, 21)));
		assertTrue(results.contains(new ItemWrapper("Backstage passes to a TAFKAL80ETC concert", 9, 50)));
		assertTrue(results.contains(new ItemWrapper("Backstage passes to a TAFKAL80ETC concert", 4, 50)));
		assertTrue(results.contains(new ItemWrapper("Backstage passes to a TAFKAL80ETC concert", 4, 48)));
		assertTrue(results.contains(new ItemWrapper("Backstage passes to a TAFKAL80ETC concert", -16, 0)));
		assertTrue(results.contains(new ItemWrapper("Conjured Mana Cake", 2, 5)));
	}

	@Test
	public void updateAfterTwoDaysTest() {

		GildedRose app = new GildedRose(items);

		int days = 2;
		for (int i = 0; i < days; i++) {
			app.updateQuality();
		}

		List<ItemWrapper> results = items;
		assertTrue(results.contains(new ItemWrapper("+5 Dexterity Vest", 8, 18)));
		assertTrue(results.contains(new ItemWrapper("Aged Brie", 0, 2)));
		assertTrue(results.contains(new ItemWrapper("Aged Brie", -7, 14)));
		assertTrue(results.contains(new ItemWrapper("Aged Brie", 0, 2)));
		assertTrue(results.contains(new ItemWrapper("Elixir of the Mongoose", 3, 5)));
		assertTrue(results.contains(new ItemWrapper("Elixir of the Mongoose", -7, 6)));
		assertTrue(results.contains(new ItemWrapper("Sulfuras, Hand of Ragnaros", 0, 80)));
		assertTrue(results.contains(new ItemWrapper("Sulfuras, Hand of Ragnaros", -1, 80)));
		assertTrue(results.contains(new ItemWrapper("Backstage passes to a TAFKAL80ETC concert", 13, 22)));
		assertTrue(results.contains(new ItemWrapper("Backstage passes to a TAFKAL80ETC concert", 8, 50)));
		assertTrue(results.contains(new ItemWrapper("Backstage passes to a TAFKAL80ETC concert", 3, 50)));
		assertTrue(results.contains(new ItemWrapper("Backstage passes to a TAFKAL80ETC concert", 3, 50)));
		assertTrue(results.contains(new ItemWrapper("Conjured Mana Cake", 1, 4)));
	}

}
