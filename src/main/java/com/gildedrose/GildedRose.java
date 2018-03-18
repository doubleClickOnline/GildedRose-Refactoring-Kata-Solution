package com.gildedrose;

import java.util.List;

class GildedRose {

	private List<Item> items;

	public GildedRose(List<Item> items) {
		this.items = items;
	}

	public List<Item> getItems() {
		return items;
	}

	public void updateQuality() {

		items.forEach(item -> updateQuality(item));
	}

	public void updateQuality(Item item) {

		if (!item.getName().equals("Aged Brie") && !item.getName().equals("Backstage passes to a TAFKAL80ETC concert")
			&& !item.getName().equals("Sulfuras, Hand of Ragnaros") && item.getQuality() > 0) {
				item.setQuality(item.getQuality() - 1);
		} else {
			if (item.getQuality() < 50) {
				item.setQuality(item.getQuality() + 1);

				if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert") && item.getQuality() < 50) {

					if (item.getSellIn() < 11) {
						item.setQuality(item.getQuality() + 1);
					}
					if (item.getSellIn() < 6) {
						item.setQuality(item.getQuality() + 1);
					}
				}
			}
		}

		if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
			item.setSellIn(item.getSellIn() - 1);
		}

		if (item.getSellIn() < 0) {
			if (!item.getName().equals("Aged Brie")) {
				if (!item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
					if (item.getQuality() > 0 && !item.getName().equals("Sulfuras, Hand of Ragnaros")) {
						item.setQuality(item.getQuality() - 1);
					}
				} else {
					item.setQuality(0);
				}
			} else {
				if (item.getQuality() < 50) {
					item.setQuality(item.getQuality() + 1);
				}
			}
		}
	}
}