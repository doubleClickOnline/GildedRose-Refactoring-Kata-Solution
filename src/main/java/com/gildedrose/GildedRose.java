package com.gildedrose;

import java.util.List;

import com.gildedrose.itemwrapper.types.ItemWrapper;

public class GildedRose {

	private List<ItemWrapper> items;

	public GildedRose(List<ItemWrapper> items) {
		this.items = items;
	}

	public List<ItemWrapper> getItems() {
		return items;
	}

	public void updateQuality() {

		items.stream().forEach(item -> update(item));
	}

	public void update(ItemWrapper item) {
		
		item.updateSellIn();
		item.updateQuality();
	}
}