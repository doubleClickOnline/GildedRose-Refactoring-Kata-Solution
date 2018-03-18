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

		items.forEach(item -> update(item));
	}
	
	public void update(Item item) {
		
		updateSellIn(item);
		updateQuality(item);
	}

	public void updateQuality(Item item) {

		if (!item.getName().equals("Aged Brie") 
			&& !item.getName().equals("Backstage passes to a TAFKAL80ETC concert")
			&& !item.getName().equals("Sulfuras, Hand of Ragnaros") 
			&& item.getQuality() > 0) {
				decreaseQuality(item);
		} else {
			if (item.getQuality() < 50) {
				increaseQuality(item);

				if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert") && item.getQuality() < 50) {

					if (item.getSellIn() < 11) {
						increaseQuality(item);
					}
					if (item.getSellIn() < 6) {
						increaseQuality(item);
					}
				}
			}
		}

		if (item.getSellIn() < 0) {
			if (!item.getName().equals("Aged Brie")) {
				if (!item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
					if (item.getQuality() > 0 && !item.getName().equals("Sulfuras, Hand of Ragnaros")) {
						decreaseQuality(item);
					}
				} else {
					resetQuality(item);
				}
			} else {
				if (item.getQuality() < 50) {
					increaseQuality(item);
				}
			}
		}
	}
	
	public void updateSellIn(Item item) {
		if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
			decreaseSellIn(item);
		}
	}
	
	public void resetQuality(Item item) {
		item.setQuality(0);
	}
	
	public void decreaseQuality(Item item) {
		item.setQuality(item.getQuality() - 1);
	}
	
	public void increaseQuality(Item item) {
		item.setQuality(item.getQuality() + 1);
	}
	
	public void decreaseSellIn(Item item) {
		item.setSellIn(item.getSellIn() - 1);
	}
	
}