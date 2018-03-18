package com.gildedrose;

import java.util.List;

import com.gildedrose.items.types.Item;

class GildedRose {

	private List<Item> items;

	public GildedRose(List<Item> items) {
		this.items = items;
	}

	public List<Item> getItems() {
		return items;
	}

	public void updateQuality() {

		items.stream().forEach(item -> update(item));
	}

	public void update(Item item) {
		
		item.updateSellIn();
		item.updateQuality();
	}
}