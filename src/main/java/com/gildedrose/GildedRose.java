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

		for (int i = 0; i < items.size(); i++) {
			if (!items.get(i).getName().equals("Aged Brie")
				&& !items.get(i).getName().equals("Backstage passes to a TAFKAL80ETC concert") 
				&& !items.get(i).getName().equals("Sulfuras, Hand of Ragnaros") 
				&& items.get(i).getQuality() > 0) {
					items.get(i).setQuality(items.get(i).getQuality() - 1);
			} else {
				if (items.get(i).getQuality() < 50) {
					items.get(i).setQuality(items.get(i).getQuality() + 1);

					if (items.get(i).getName().equals("Backstage passes to a TAFKAL80ETC concert") 
						&& items.get(i).getQuality() < 50) {
						
						if (items.get(i).getSellIn() < 11) {
							items.get(i).setQuality(items.get(i).getQuality() + 1);
						}
						if (items.get(i).getSellIn() < 6) {
							items.get(i).setQuality(items.get(i).getQuality() + 1);
						}
					}
				}
			}

			if (!items.get(i).getName().equals("Sulfuras, Hand of Ragnaros")) {
				items.get(i).setSellIn(items.get(i).getSellIn() - 1);
			}

			if (items.get(i).getSellIn() < 0) {
				if (!items.get(i).getName().equals("Aged Brie")) {
					if (!items.get(i).getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
						if (items.get(i).getQuality() > 0 
							&& !items.get(i).getName().equals("Sulfuras, Hand of Ragnaros")) {
								items.get(i).setQuality(items.get(i).getQuality() - 1);
						}
					} else {
						items.get(i).setQuality(0);
					}
				} else {
					if (items.get(i).getQuality() < 50) {
						items.get(i).setQuality(items.get(i).getQuality() + 1);
					}
				}
			}
		}
	}
}